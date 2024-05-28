package com.example.android.politicalpreparedness.election

import androidx.lifecycle.LiveData
import com.example.android.politicalpreparedness.database.ElectionDatabase
import com.example.android.politicalpreparedness.network.models.Election

class ElectionsDataSource(private val database: ElectionDatabase) {

    val elections: LiveData<List<Election>> get() = database.electionDao.getAllElections()
    val savedElections: LiveData<List<Election>> get() = database.electionDao.getSavedElections()
}
