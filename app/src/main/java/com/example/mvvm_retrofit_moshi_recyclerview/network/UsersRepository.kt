package com.example.mvvm_retrofit_moshi_recyclerview.network

import com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass.Item
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersRepository {
    val apiService by lazy {
        APIClientObject.apiService
    }

    suspend fun getAllUsersFromResponse() : List<Item> {
        return withContext(Dispatchers.IO) {
            val response = apiService.getAllUsers().execute()
            response.body()?.items ?: listOf()
        }
    }
}