package com.mbahrami900913.mb_digikala_clone.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.mbahrami900913.mb_digikala_clone.R
import com.mbahrami900913.mb_digikala_clone.navigation.Screen
import com.mbahrami900913.mb_digikala_clone.ui.components.Loading3Dots
import com.mbahrami900913.mb_digikala_clone.ui.theme.splashBg
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    Splash()
    LaunchedEffect(key1 = true) {
        delay(2000)
        navController.navigate(route = Screen.Home.route)
    }
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colors.splashBg)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.digi_logo),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(100.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.digi_txt_white),
                contentDescription = null,
                modifier = Modifier.height(30.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Loading3Dots(isDark = false)
        }
    }
}