package com.imgego.androidarchkotlin.data.entitites

import androidx.compose.runtime.Immutable

@Immutable
data class Pagination(
    val total: Int,
    val limit: Int,
    val offset: Int,
    val totalPages: Int,
    val currentPage: Int,
)