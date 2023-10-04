package com.imgego.androidarchkotlin.data.entitites.artwork

import androidx.compose.runtime.Immutable
import com.google.gson.annotations.SerializedName
import com.imgego.androidarchkotlin.data.entitites.Pagination

@Immutable
data class ArtworksResponse(
    @SerializedName("pagination")
    val pagination: Pagination,
    @SerializedName("data")
    val artworks: List<Artwork>
)