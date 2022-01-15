package com.example.omdbmovies.data.entity


import com.google.gson.annotations.SerializedName

data class NetworkResponse(
    @SerializedName("Response")
    val response: String?,
    @SerializedName("Search")
    val movies: List<Movie>?,
    @SerializedName("totalResults")
    val totalResults: String?
)