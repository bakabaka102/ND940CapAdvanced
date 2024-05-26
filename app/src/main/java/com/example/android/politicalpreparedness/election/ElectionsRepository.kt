package com.example.android.politicalpreparedness.election

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.network.models.RepresentativeResponse
import com.example.android.politicalpreparedness.network.models.VoterInfoResponse
import com.example.android.politicalpreparedness.utils.LogUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class ElectionsRepository(private val database: ElectionDatabase) {

    val elections: LiveData<List<Election>> get() = database.electionDao.getAllElections()
    val savedElections: LiveData<List<Election>> get() = database.electionDao.getSavedElections()


    private val _voterInfo = MutableLiveData<VoterInfoResponse>()
    val voterInfo: LiveData<VoterInfoResponse> get() = _voterInfo

    val representatives = MutableLiveData<RepresentativeResponse>()


    fun getElection(id: Int) = database.electionDao.getElectionById(id)

    suspend fun getVoterInfo(electionId: Int, address: String) {
        try {
            withContext(Dispatchers.IO) {
                val response =
                    CivicsApi.retrofitService.getVoterInfo(address, electionId)/*.await()*/
                _voterInfo.postValue(response)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    suspend fun insertElection(election: Election) {
        LogUtils.i("Election saved: ${election.saved}")
        withContext(Dispatchers.IO) {
            database.electionDao.insertElection(election)
        }
    }

    suspend fun refreshElections() {
        try {
            withContext(Dispatchers.IO) {
                loadElectionsAndSaveToDB()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private suspend fun loadElectionsAndSaveToDB() {
        val electionResponse = CivicsApi.retrofitService.getElections()/*.await()*/
        database.electionDao.insertElections(electionResponse.elections)
    }

}
