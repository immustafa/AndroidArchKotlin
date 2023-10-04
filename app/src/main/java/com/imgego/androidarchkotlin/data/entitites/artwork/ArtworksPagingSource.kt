package com.imgego.androidarchkotlin.data.entitites.artwork

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.imgego.androidarchkotlin.network.PublicApi

class ArtworksPagingSource(
    private val apiService: PublicApi,
) : PagingSource<Int, Artwork>() {
    override fun getRefreshKey(state: PagingState<Int, Artwork>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Artwork> {
        return try {
            val page = params.key ?: 1
            val response = apiService.getArtworks(page = page)

            LoadResult.Page(
                data = response.artworks,
                prevKey = if (page == 1) null else page.minus(1),
                nextKey = if (response.artworks.isEmpty()) null else page.plus(1),
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}