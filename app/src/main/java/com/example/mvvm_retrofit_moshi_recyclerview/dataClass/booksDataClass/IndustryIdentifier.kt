package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IndustryIdentifier(
    @Json(name = "identifier")
    val identifier: String?,
    @Json(name = "type")
    val type: String?
)