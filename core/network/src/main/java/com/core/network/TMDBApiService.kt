package com.core.network

import com.core.network.model.MovieListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBApiService {

    //https://api.themoviedb.org/3/search/movie?api_key=794fe9c460992280f11d575e3e467de8&query=harry
    @GET("3/search/movie")
    suspend fun getMoviesList(
        @Query("api_key") apikey: String,
        @Query("query") s: String
    ): MovieListResponse

}