package com.example.android.politicalpreparedness.utils

sealed class Result<out T> {
    data class Failed<T>(val exception: Exception) : Result<T>()
    data class Success<T>(val data: T) : Result<T>()
    class Loading<T>() : Result<T>()
}