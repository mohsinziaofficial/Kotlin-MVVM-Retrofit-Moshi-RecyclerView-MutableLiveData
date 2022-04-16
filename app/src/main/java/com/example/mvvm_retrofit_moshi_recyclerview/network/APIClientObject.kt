package com.example.mvvm_retrofit_moshi_recyclerview.network

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object APIClientObject {
   val BASE_URL = "https://www.googleapis.com/books/v1/"

    val httpClient by lazy {
        OkHttpClient
            .Builder()
            .build()
    }

    val retrofitInstance by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(httpClient)
            .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
            .build()
    }

    val apiService by lazy {
        retrofitInstance.create(APIService::class.java)
    }
}