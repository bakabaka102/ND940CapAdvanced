package com.example.android.politicalpreparedness.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.core.content.getSystemService

object NetWorkUtils {
    fun isConnected(context: Context): Boolean {
       /* val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager*/
        val connectivityManager = context.getSystemService<ConnectivityManager>()
        return run {
            val activeNetwork = connectivityManager?.activeNetwork ?: return false
            val networkCapabilities =
                connectivityManager.getNetworkCapabilities(activeNetwork) ?: return false
            when {
                networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                else -> false
            }
        }
    }
}