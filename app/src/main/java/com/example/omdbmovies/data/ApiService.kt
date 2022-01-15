package com.example.omdbmovies.data

import com.example.omdbmovies.data.entity.Movie
import com.example.omdbmovies.data.entity.NetworkResponse
import com.example.omdbmovies.utils.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/")
    fun searchMovies(
        @Query("s") searchText: String,
        @Query("apikey") key: String = API_KEY,
    ) : NetworkResponse

    @GET("/")
    fun getMovie(
        @Query("i") imdbID: String,
        @Query("apikey") key: String = API_KEY,
    ): Movie
}