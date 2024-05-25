package com.example.android.politicalpreparedness.election.models

import android.os.Parcelable
import androidx.annotation.Keep
import com.example.android.politicalpreparedness.network.models.Division
import com.example.android.politicalpreparedness.network.models.Election
import kotlinx.parcelize.Parcelize
import java.util.Date

@Keep
@Parcelize
data class ElectionModel(
    val id: Int,
    val name: String,
    val electionDay: Date,
    val division: Division,
    val saved: Boolean,
) : Parcelable

fun ElectionModel.toElection() =
    Election(
        id = id,
        name = name,
        electionDay = electionDay,
        division = division,
        saved = saved
    )


/*
@Parcelize
@JsonClass(generateAdapter = true)
data class Division(
    val id: String,
    val country: String,
    val state: String,
) : Parcelable*/
