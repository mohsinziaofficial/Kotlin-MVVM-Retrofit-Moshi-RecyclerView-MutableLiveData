package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookResponse(
    @Json(name = "items")
    val items: List<Item>?,
    @Json(name = "kind")
    val kind: String?,
    @Json(name = "totalItems")
    val totalItems: Int?
)