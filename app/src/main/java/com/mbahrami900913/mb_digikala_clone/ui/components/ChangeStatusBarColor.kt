package com.mbahrami900913.mb_digikala_clone.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mbahrami900913.mb_digikala_clone.navigation.Screen
import com.mbahrami900913.mb_digikala_clone.ui.theme.splashBg

@Composable
fun ChangeStatusBarColor(navController: NavController) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
    val systemUiController = rememberSystemUiController()

    when (currentRoute) {
        Screen.Splash.route -> {
            systemUiController.setStatusBarColor(MaterialTheme.colors.splashBg)
        }
        else -> {
            systemUiController.setStatusBarColor(Color.White)
        }
    }
}