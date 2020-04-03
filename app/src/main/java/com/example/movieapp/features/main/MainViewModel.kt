package com.example.movieapp.ui.main

import androidx.lifecycle.ViewModel
import com.elifox.legocatalog.legoset.data.MovieRepository
import com.example.movieapp.data.MovieDao
import com.example.movieapp.data.MovieRemoteDataSource
import com.example.movieapp.data.resultLiveData

class MainViewModel @javax.inject.Inject constructor(dao: MovieDao, remoteDataSource: MovieRepository): ViewModel() {
    // TODO: Implement the ViewModel
//    val movies = resultLiveData(
//        databaseQuery = { dao.getMovies() },
//        networkCall = { remoteDataSource.fetchMovies() },
//        saveCallResult = { dao.insertAll(it.results) })
}
