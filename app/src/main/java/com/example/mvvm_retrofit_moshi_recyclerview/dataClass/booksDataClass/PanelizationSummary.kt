package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PanelizationSummary(
    @Json(name = "containsEpubBubbles")
    val containsEpubBubbles: Boolean?,
    @Json(name = "containsImageBubbles")
    val containsImageBubbles: Boolean?
)