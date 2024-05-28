package com.example.android.politicalpreparedness.election

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.CivicsApi
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.network.models.State
import com.example.android.politicalpreparedness.utils.LogUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import com.example.android.politicalpreparedness.utils.Result

class ElectionsRepository(private val database: ElectionDatabase) {

    val elections: LiveData<List<Election>> get() = database.electionDao.getAllElections()
    val savedElections: LiveData<List<Election>> get() = database.electionDao.getSavedElections()

    private val _electionInfo = MutableLiveData<State?>()
    val electionInfo: LiveData<State?> get() = _electionInfo

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> get() = _isLoading

    fun getElection(id: Int) = database.electionDao.getElectionById(id)

    suspend fun getVoterInfo(address: String, electionId: Int) {
        _isLoading.postValue(true)
        try {
            withContext(Dispatchers.IO) {
                val response =
                    CivicsApi.retrofitService.getVoterInfo(address, electionId).state?.first()
                _electionInfo.postValue(response)
                _isLoading.postValue(false)
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
        /*try {
            withContext(Dispatchers.IO) {
                CivicsApi.retrofitService.getElections()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }*/
        try {
            withContext(Dispatchers.IO) {
                val onlineElections: List<Election> = CivicsApi.retrofitService.getElections().elections
                val localElections: Result<List<Election>> = getElectionsSortedFromDB()
                database.electionDao.deleteAllElection()
                if (localElections is Result.Success) {
                    val saved: List<Election> = localElections.data.filter { local ->
                        local.saved
                    }
                    onlineElections.map { onlineElection ->
                        onlineElection.copy(saved = saved.firstOrNull {
                            it.id == onlineElection.id
                        }?.saved == true)
                    }
                } else {
                    onlineElections
                }.run {
                    onlineElections.map { it.copy(saved = false) }
                    database.electionDao.insertElections(onlineElections)
                }
            }
        } catch (ex: Exception) {
            LogUtils.e("Error: ${ex.message}")
        }
    }

    private suspend fun getElectionsSortedFromDB(): Result<List<Election>> {
        return withContext(Dispatchers.IO) {
            return@withContext try {
                Result.Success(database.electionDao.getAllElectionSorted())
            } catch (ex: Exception) {
                Result.Failed(ex)
            }
        }
    }

}
