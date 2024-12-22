package com.jp.indnews.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jp.indnews.network.NewsModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel:ViewModel() {

    val repo=Repo()
    val res=MutableStateFlow<Response<NewsModel>?>(null)
    val newsState: StateFlow<Response<NewsModel>?> =res.asStateFlow()
    var currentCategory="GENERAL"

    init {
        fetchNews()
    }

    fun fetchNews(category:String="GENERAL"){
       viewModelScope.launch {
           try {
               currentCategory=category
               val response = repo.newsProvider(category)
               res.value = response
           } catch (e: Exception) {
               res.value = null
           }
       }
    }
}