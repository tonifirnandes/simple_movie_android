package com.example.movieapp.api

import com.example.movieapp.BuildConfig
import com.example.movieapp.data.ResultsResponse
import com.example.movieapp.data.Movie
import com.example.movieapp.data.Review
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Lego REST API access points
 */
interface MoviesService {

    companion object {
        const val ENDPOINT = BuildConfig.API_BASE_URL
    }

    @GET("movie/{id}")
    suspend fun getMovieDetails(@Path("id") id: String): Response<Movie>

    @GET("movie/{category}")
    suspend fun getMovieByCategory(@Path("category") id: String, @Query("page") page: Int? = null): Response<ResultsResponse<Movie>>

    @GET("movie/{id}/reviews")
    suspend fun getMovieReviews(@Path("id") id: String, @Query("page") page: Int? = null): Response<ResultsResponse<Review>>

}
