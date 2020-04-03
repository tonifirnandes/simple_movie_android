package com.example.movieapp.data

import com.google.gson.annotations.SerializedName

data class ResultsResponse<T>(
    @SerializedName("page")
    val page: Int,
    @SerializedName("total_results")
    val total_results: Int,
    @SerializedName("total_pages")
    val total_page: Int,
    @SerializedName("results")
    val results: List<T>
)