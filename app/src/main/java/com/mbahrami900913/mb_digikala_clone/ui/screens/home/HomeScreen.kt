package com.mbahrami900913.mb_digikala_clone.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(navController: NavHostController) {
    rememberSystemUiController().setNavigationBarColor(Color.Black)
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Text(text = "Home")
    }
}