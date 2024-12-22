package com.jp.indnews.network

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiProvider {

    val BASE_URL = "https://newsapi.org/v2/"
    fun ProviderApi() =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiServer::class.java)
}