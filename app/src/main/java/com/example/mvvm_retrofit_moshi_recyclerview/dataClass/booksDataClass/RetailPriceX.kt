package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RetailPriceX(
    @Json(name = "amount")
    val amount: Double?,
    @Json(name = "currencyCode")
    val currencyCode: String?
)