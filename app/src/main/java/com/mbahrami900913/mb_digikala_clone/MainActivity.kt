package com.mbahrami900913.mb_digikala_clone

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mbahrami900913.mb_digikala_clone.navigation.BottomNavigationBar
import com.mbahrami900913.mb_digikala_clone.navigation.SetupNavGraph
import com.mbahrami900913.mb_digikala_clone.ui.components.AppConfig
import com.mbahrami900913.mb_digikala_clone.ui.components.ChangeStatusBarColor
import com.mbahrami900913.mb_digikala_clone.ui.theme.MB_Digikala_cloneTheme
import com.mbahrami900913.mb_digikala_clone.util.Constants
import com.mbahrami900913.mb_digikala_clone.util.LocaleUtils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MB_Digikala_cloneTheme {
                navController = rememberNavController()
                ChangeStatusBarColor(navController = navController)
                AppConfig()

                val direction = remember {
                    mutableStateOf(
                        if (Constants.USER_LANGUAGE == Constants.PERSIAN_LANG)
                            LayoutDirection.Rtl
                        else
                            LayoutDirection.Ltr
                    )
                }

                LocaleUtils.setLocale(LocalContext.current, Constants.USER_LANGUAGE)
                CompositionLocalProvider(LocalLayoutDirection.provides(direction.value)) {
                    Scaffold(bottomBar = {
                        BottomNavigationBar(navController = navController,
                            onItemClick = { bottomNavItem ->
                                navController.navigate(bottomNavItem.route)
                            })
                    }) {
                        SetupNavGraph(navController = navController)

                    }
                }
            }
        }
    }
}