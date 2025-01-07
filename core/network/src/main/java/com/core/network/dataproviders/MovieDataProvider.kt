package com.core.network.dataproviders

import com.core.network.TMDBApiService
import javax.inject.Inject

class MovieDataProvider @Inject constructor(private val tmdbApiService: TMDBApiService) {

    suspend fun getMoviesList(apiKey: String, q: String) = tmdbApiService.getMoviesList(apiKey, q)
}