package com.feature.movie.data.di

import com.core.network.dataproviders.MovieDataProvider
import com.feature.movie.data.repo.MovieRepositoryImpl
import com.feature.movie.domain.repo.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataLayerModule {

    @Provides
    fun provideMovieRepository(dataProvider: MovieDataProvider): MovieRepository {
        return MovieRepositoryImpl(dataProvider)
    }

}