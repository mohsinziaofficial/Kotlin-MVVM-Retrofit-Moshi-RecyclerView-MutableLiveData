package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ReadingModes(
    @Json(name = "image")
    val image: Boolean?,
    @Json(name = "text")
    val text: Boolean?
)