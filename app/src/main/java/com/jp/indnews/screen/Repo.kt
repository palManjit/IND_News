package com.jp.indnews.screen

import com.jp.indnews.network.ApiProvider
import com.jp.indnews.network.NewsModel
import retrofit2.Response

class Repo {
    suspend fun newsProvider(category:String):Response<NewsModel>{
        return ApiProvider.ProviderApi().getNewsFromServer(
            q=category.lowercase(),
            sortBy ="publishedAt",
            apiKey = "2cb3c7ed83e0455397a18c14afa22856"
        )
    }
}