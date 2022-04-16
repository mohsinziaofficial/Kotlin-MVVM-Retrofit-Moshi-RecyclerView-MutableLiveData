package com.example.mvvm_retrofit_moshi_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm_retrofit_moshi_recyclerview.adapter.MainAdapter
import com.example.mvvm_retrofit_moshi_recyclerview.databinding.ActivityMainBinding
import com.example.mvvm_retrofit_moshi_recyclerview.viewModel.UsersViewModel

class MainActivity : AppCompatActivity() {

    private var _bindindg : ActivityMainBinding? = null
    private val binding get() = _bindindg!!
    private lateinit var viewModel : UsersViewModel

    private val mainAdapter by lazy {
        MainAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _bindindg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[UsersViewModel::class.java]
        viewModel.getAllUsers()
        viewModel.usersLiveDataList.observe(this, Observer {
            Log.i("MyTag", "Users List : $it")
            mainAdapter.setUserList(it)

            binding.apply {
                rView.layoutManager = LinearLayoutManager(this@MainActivity)
                rView.adapter = mainAdapter
            }
        })
    }
}