package com.imgego.androidarchkotlin.data.entitites.artwork

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.imgego.androidarchkotlin.network.PublicApi
import javax.inject.Inject

class ArtworkRepository @Inject constructor(
    private val apiService: PublicApi
) {
    fun getArtworks() = Pager(
        config = PagingConfig(
            pageSize = 12,
        ),
        pagingSourceFactory = {
            ArtworksPagingSource(apiService)
        }
    ).flow
}