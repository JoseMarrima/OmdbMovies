package com.example.omdbmovies.data.repository

import com.example.omdbmovies.data.ApiService
import com.example.omdbmovies.domain.repository.IMovieRepository

class DefaultMovieRepository(private val apiService: ApiService): IMovieRepository {
}