package com.example.android.politicalpreparedness.network.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class RepresentativeResponse(
    val offices: @RawValue List<Office>,
    val officials: @RawValue List<Official>
) : Parcelable