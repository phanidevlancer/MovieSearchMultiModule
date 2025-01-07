package com.core.network.model

data class MovieListResponse(
    val page: Int,
    val results: List<RemoteMovie>,
    val total_pages: Int,
    val total_results: Int
)