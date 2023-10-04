package com.imgego.androidarchkotlin.network

import com.imgego.androidarchkotlin.data.entitites.artwork.ArtworksResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface PublicApi {
    @GET("artworks")
    suspend fun getArtworks(
        @Query("page") page: Int? = 1,
    ): ArtworksResponse

    @GET("artworks/search")
    suspend fun searchArtworks(
        @Query("q") q: String? = null,
    ): ArtworksResponse

}