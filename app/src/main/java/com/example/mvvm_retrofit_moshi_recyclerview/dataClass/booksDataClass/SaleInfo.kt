package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SaleInfo(
    @Json(name = "buyLink")
    val buyLink: String?,
    @Json(name = "country")
    val country: String?,
    @Json(name = "isEbook")
    val isEbook: Boolean?,
    @Json(name = "listPrice")
    val listPrice: ListPrice?,
    @Json(name = "offers")
    val offers: List<Offer>?,
    @Json(name = "retailPrice")
    val retailPrice: RetailPriceX?,
    @Json(name = "saleability")
    val saleability: String?
)