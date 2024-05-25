package com.example.android.politicalpreparedness.network

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class CivicsHttpClient : OkHttpClient() {

    companion object {

        fun getClient(): OkHttpClient {
            return Builder().readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .addInterceptor { chain ->
                    val original = chain.request()
                    val url = original.url().newBuilder()
                        .addQueryParameter("key", APIConstants.API_KEY).build()
                    val request = original.newBuilder().url(url).build()
                    chain.proceed(request)
                }.retryOnConnectionFailure(true).build()
        }

    }

}