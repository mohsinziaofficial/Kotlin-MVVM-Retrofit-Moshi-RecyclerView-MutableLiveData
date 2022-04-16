package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Item(
    @Json(name = "accessInfo")
    val accessInfo: AccessInfo?,
    @Json(name = "etag")
    val etag: String?,
    @Json(name = "id")
    val id: String?,
    @Json(name = "kind")
    val kind: String?,
    @Json(name = "saleInfo")
    val saleInfo: SaleInfo?,
    @Json(name = "searchInfo")
    val searchInfo: SearchInfo?,
    @Json(name = "selfLink")
    val selfLink: String?,
    @Json(name = "volumeInfo")
    val volumeInfo: VolumeInfo?
)