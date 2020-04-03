package com.elifox.legocatalog.legoset.data

import com.example.movieapp.data.MovieDao
import com.example.movieapp.data.MovieRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Repository module for handling data operations.
 */
@Singleton
class MovieRepository @Inject constructor(private val dao: MovieDao,
                                          private val movieRemoteDataSource: MovieRemoteDataSource) {

    companion object {

        const val PAGE_SIZE = 100

        // For Singleton instantiation
        @Volatile
        private var instance: MovieRepository? = null

        fun getInstance(dao: MovieDao, movieRemoteDataSource: MovieRemoteDataSource) =
                instance ?: synchronized(this) {
                    instance
                            ?: MovieRepository(dao, movieRemoteDataSource).also { instance = it }
                }
    }
}
