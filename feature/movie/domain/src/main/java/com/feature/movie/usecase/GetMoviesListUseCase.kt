package com.feature.movie.usecase

import com.UiEvent
import com.feature.movie.domain.repo.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMoviesListUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    operator fun invoke(apiKey: String, q: String) = flow {
        emit(UiEvent.Loading())
        emit(UiEvent.Success(movieRepository.getMoviesList(apiKey, q)))
    }.catch {
        emit(UiEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)

}