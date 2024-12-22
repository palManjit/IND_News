package com.jp.indnews.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun HomePage(newsViewModel: NewsViewModel) {

    val newsState by newsViewModel.newsState.collectAsState()

}