package com.mbahrami900913.mb_digikala_clone.navigation

import androidx.compose.ui.graphics.painter.Painter

data class BottomNavItem(
    val name: String,
    val route: String,
    val selectedIcon: Painter,
    val deSelectedIcon: Painter
)
