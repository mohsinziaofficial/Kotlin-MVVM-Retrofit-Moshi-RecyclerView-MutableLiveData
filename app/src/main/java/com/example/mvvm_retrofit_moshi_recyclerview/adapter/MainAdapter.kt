package com.example.mvvm_retrofit_moshi_recyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvm_retrofit_moshi_recyclerview.R
import com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass.Item
import com.example.mvvm_retrofit_moshi_recyclerview.databinding.ItemBinding

class MainAdapter() : RecyclerView.Adapter<MyViewHolder>() {
    private val usersList = ArrayList<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val bindind = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(bindind)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(usersList[position])
    }

    override fun getItemCount(): Int {
        return usersList.size
    }

    fun setUserList(bookItem: List<Item>) {
        usersList.clear()
        usersList.addAll(bookItem)
    }
}

class MyViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bindData(bookItem : Item) {
        binding.apply {
            tvTitle.text = bookItem.volumeInfo?.title
            tvPublisher.text = bookItem.volumeInfo?.publisher
            tvDescription.text = bookItem.volumeInfo?.description
            Log.i("MyTag2", "Volume Info : $bookItem")
            Glide.with(itemView)
                .load(bookItem.volumeInfo?.imageLinks?.smallThumbnail)
                .centerCrop()
                .circleCrop()
                .into(thumbImageView)

            if (bookItem.volumeInfo?.title == null) {
                tvTitle.text = "Book title not available."
            }
            if (bookItem.volumeInfo?.publisher == null) {
                tvPublisher.text = "Publisher details not available."
            }
            if (bookItem.volumeInfo?.description == null) {
                tvDescription.text = "Book description not available."
            }
            if (bookItem.volumeInfo?.imageLinks?.smallThumbnail == null) {
                Glide.with(itemView)
                    .load(R.drawable.sample_book)
                    .centerCrop()
                    .circleCrop()
                    .into(thumbImageView)
            }
        }
    }
}