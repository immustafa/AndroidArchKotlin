package com.imgego.androidarchkotlin.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.imgego.androidarchkotlin.data.entitites.artwork.Artwork
import com.imgego.androidarchkotlin.data.entitites.artwork.ArtworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ArtworksViewModel @Inject constructor(
    private val repository: ArtworkRepository,
) : ViewModel() {

    fun getArtworks(): Flow<PagingData<Artwork>> = repository.getArtworks().cachedIn(viewModelScope)
}