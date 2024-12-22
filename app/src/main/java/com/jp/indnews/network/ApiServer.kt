package com.jp.indnews.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServer {
    //https://newsapi.org/v2/everything?q=tata&sortBy=publishedAt&apiKey=2cb3c7ed83e0455397a18c14afa22856
    @GET("everything")
    suspend fun getNewsFromServer(
        @Query("q") q:String,
        @Query("sortBy") sortBy:String,
        @Query("apiKey") apiKey:String
    ):Response<NewsModel>
}