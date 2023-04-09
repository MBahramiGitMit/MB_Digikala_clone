package com.mbahrami900913.mb_digikala_clone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mbahrami900913.mb_digikala_clone.navigation.SetupNavGraph
import com.mbahrami900913.mb_digikala_clone.ui.theme.MB_Digikala_cloneTheme
import com.mbahrami900913.mb_digikala_clone.ui.theme.splashBg

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MB_Digikala_cloneTheme {
                navController = rememberNavController()

                Scaffold(backgroundColor = MaterialTheme.colors.splashBg, bottomBar = {}) {
                    SetupNavGraph(navController = navController)

                }

            }
        }
    }
}