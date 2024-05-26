package com.example.android.politicalpreparedness.network

import com.example.android.politicalpreparedness.BuildConfig

object APIConstants {

    const val BASE_URL = "https://www.googleapis.com/civicinfo/v2/"
    const val API_KEY = BuildConfig.API_KEY
    const val ELECTIONS = "elections"
    const val VOTER_INFO = "voterinfo"
    const val REPRESENTATIVES = "representatives"


}