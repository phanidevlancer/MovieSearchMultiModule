package com.feature.movie.data.repo

import com.core.network.dataproviders.MovieDataProvider
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val dataProvider: MovieDataProvider) :
    MovieRepository {
    override suspend fun getMoviesList(apiKey: String, q: String): List<Movie> {
        return dataProvider.getMoviesList(apiKey, q).toDomainMovieList()
    }

}