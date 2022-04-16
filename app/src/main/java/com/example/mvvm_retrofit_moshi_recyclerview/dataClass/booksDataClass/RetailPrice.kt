package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RetailPrice(
    @Json(name = "amountInMicros")
    val amountInMicros: Int?,
    @Json(name = "currencyCode")
    val currencyCode: String?
)