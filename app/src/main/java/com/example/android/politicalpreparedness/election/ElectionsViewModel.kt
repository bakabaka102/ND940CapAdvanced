package com.example.android.politicalpreparedness.election

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.politicalpreparedness.database.ElectionDatabase
import kotlinx.coroutines.launch

class ElectionsViewModel(application: Application) : AndroidViewModel(application) {

    private val database = ElectionDatabase.getInstance(application)
    private val repository = ElectionsRepository(database)
    val upcomingElections = repository.elections
    val savedElections = repository.savedElections


    init {
        viewModelScope.launch {
            repository.refreshElections()
        }
    }

}