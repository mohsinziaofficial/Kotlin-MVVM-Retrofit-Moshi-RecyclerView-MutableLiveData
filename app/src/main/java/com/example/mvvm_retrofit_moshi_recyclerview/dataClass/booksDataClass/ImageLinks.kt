package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageLinks(
    @Json(name = "smallThumbnail")
    val smallThumbnail: String?,
    @Json(name = "thumbnail")
    val thumbnail: String?
)