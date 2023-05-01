package com.mbahrami900913.mb_digikala_clone.ui.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.mbahrami900913.mb_digikala_clone.MainActivity
import com.mbahrami900913.mb_digikala_clone.util.Constants
import com.mbahrami900913.mb_digikala_clone.viewmodel.DataStoreViewModel

@Composable
fun ProfileScreen(
    navController: NavHostController,
    dataStoreVM: DataStoreViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.Start
    ) {
        val activity = LocalContext.current as Activity
        Text(text = "Profile")

        Button(onClick = {
            dataStoreVM.saveUserLanguage(Constants.PERSIAN_LANG)
            activity.run {
                finish()
                startActivity(Intent(activity, MainActivity::class.java))
            }
        }) {
            Text(text = "Farsi")
        }
        Button(onClick = {
            dataStoreVM.saveUserLanguage(Constants.ENGLISH_LANG)
            activity.run {
                finish()
                startActivity(Intent(activity, MainActivity::class.java))
            }
        }) {
            Text(text = "English")
        }
    }
}