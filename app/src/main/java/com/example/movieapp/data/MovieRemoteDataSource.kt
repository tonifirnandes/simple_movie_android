package com.example.movieapp.data

import com.example.movieapp.api.BaseDataSource
import com.example.movieapp.api.MoviesService
import javax.inject.Inject

/**
 * Works with the Lego API to get data.
 */
//@OpenForTesting
class MovieRemoteDataSource @Inject constructor(private val service: MoviesService) : BaseDataSource() {

    suspend fun fetchMovies(category: MovieCategory, page: Int)
            = getResult { service.getMovieByCategory(category.name, page) }

    suspend fun fetchMovie(id: String)
            = getResult { service.getMovieDetails(id) }

    suspend fun fetchMovieReviews(id: String, page: Int)
            = getResult { service.getMovieReviews(id, page) }
}
