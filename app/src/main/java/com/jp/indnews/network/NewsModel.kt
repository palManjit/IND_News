package com.jp.indnews.network

data class NewsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)