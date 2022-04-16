package com.example.mvvm_retrofit_moshi_recyclerview.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass.Item
import com.example.mvvm_retrofit_moshi_recyclerview.network.UsersRepository
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {
    private var usersMutableLiveDataList = MutableLiveData<List<Item>>()
    val usersLiveDataList : LiveData<List<Item>> = usersMutableLiveDataList
    val usersRepository by lazy {
        UsersRepository()
    }

    fun getAllUsers() = viewModelScope.launch {
        var response = usersRepository.getAllUsersFromResponse()
        usersMutableLiveDataList.postValue(response)
    }
}