package com.imgego.androidarchkotlin.data.entitites.artwork

import androidx.compose.runtime.Immutable
import com.google.gson.annotations.SerializedName

@Immutable
data class Artwork(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("api_link")
    val url: String?
)