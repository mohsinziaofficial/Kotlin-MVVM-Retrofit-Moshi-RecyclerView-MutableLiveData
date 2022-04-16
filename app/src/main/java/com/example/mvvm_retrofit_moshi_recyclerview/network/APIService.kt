package com.example.mvvm_retrofit_moshi_recyclerview.network

import com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass.BookResponse
import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("volumes?q=harry")
    fun getAllUsers() : Call<BookResponse>
}