package com.mbahrami900913.mb_digikala_clone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mbahrami900913.mb_digikala_clone.ui.screens.*
import com.mbahrami900913.mb_digikala_clone.ui.screens.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Category.route) {
            CategoryScreen(navController = navController)
        }
        composable(route = Screen.Basket.route) {
            BasketScreen(navController = navController)
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
    }
}