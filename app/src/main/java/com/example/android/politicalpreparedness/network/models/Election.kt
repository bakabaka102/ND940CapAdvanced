package com.example.android.politicalpreparedness.network.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize
import java.util.Date

@Entity(tableName = "election_table")
@Parcelize
data class Election(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "electionDay")
    val electionDay: Date,
    @Embedded(prefix = "division_")
    @Json(name = "ocdDivisionId")
    val division: Division,
    @ColumnInfo(name = "saved")
    var saved: Boolean = false,
) : Parcelable