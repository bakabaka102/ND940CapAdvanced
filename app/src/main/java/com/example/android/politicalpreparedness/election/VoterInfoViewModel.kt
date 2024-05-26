package com.example.android.politicalpreparedness.election

import android.app.Application
import android.text.TextUtils
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.models.Election
import kotlinx.coroutines.launch

class VoterInfoViewModel(private val application: Application) : AndroidViewModel(application) {

    private val database = ElectionDatabase.getInstance(application)
    private val electionsRepository = ElectionsRepository(database)

    val voterInfo = electionsRepository.voterInfo

    var Url = MutableLiveData<String>()

    private val electionId = MutableLiveData<Int>()
    val election = electionId.switchMap { id ->
        liveData {
            emitSource(electionsRepository.getElection(id))
        }
    }

    fun getElection(id: Int) {
        electionId.value = id
    }


    fun SaveElection(election: Election) {
        election.saved = !election.saved
        viewModelScope.launch {
            electionsRepository.insertElection(election)
        }
    }

    fun getVoterInfo(electionId: Int, address: String) =
        viewModelScope.launch {
            electionsRepository.getVoterInfo(electionId, address)
        }


    fun intentUrl(url: String) {
        Url.value = url
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