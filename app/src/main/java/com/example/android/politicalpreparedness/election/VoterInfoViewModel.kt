package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.models.AdministrationBody
import com.example.android.politicalpreparedness.network.models.Election
import com.example.android.politicalpreparedness.network.models.State
import kotlinx.coroutines.launch

class VoterInfoViewModel(private val application: Application) : AndroidViewModel(application) {

    private val database = ElectionDatabase.getInstance(application)
    private val electionsRepository = ElectionsRepository(database)

    val electionInfo: LiveData<State?> = electionsRepository.electionInfo

    /*
        private val _electionDetails: MutableLiveData<State?> = MutableLiveData()
        val electionDetails: LiveData<State?> = Transformations.map(_electionDetails) {
            when (it) {
                is Result.Success -> it.data
                else -> null
            }
        }
    */

    var url = MutableLiveData<String>()

    private val electionId = MutableLiveData<Int>()
    val election = electionId.switchMap { id ->
        liveData {
            emitSource(electionsRepository.getElection(id))
        }
    }

    fun getElection(id: Int) {
        electionId.value = id
    }


    fun saveElection(election: Election) {
        election.saved = !election.saved
        viewModelScope.launch {
            electionsRepository.insertElection(election)
        }
    }

    fun getVoterInfo(address: String, electionId: Int) =
        viewModelScope.launch {
            electionsRepository.getVoterInfo(address, electionId)
        }


    fun intentUrl(url: String) {
        this.url.value = url
    }


    //TODO: Add live data to hold voter info

    //TODO: Add var and methods to populate voter info

    //TODO: Add var and methods to support loading URLs

    //TODO: Add var and methods to save and remove elections to local database
    //TODO: cont'd -- Populate initial state of save button to reflect proper action based on election saved status

    /**
     * Hint: The saved state can be accomplished in multiple ways. It is directly related to how elections are saved/removed from the database.
     */

}