package com.mbahrami900913.mb_digikala_clone.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.mbahrami900913.mb_digikala_clone.util.Constants
import com.mbahrami900913.mb_digikala_clone.viewmodel.DataStoreViewModel

@Composable
fun AppConfig(dataStoreVM: DataStoreViewModel = hiltViewModel()) {
    LaunchedEffect(key1 = true) {
        Constants.USER_LANGUAGE = dataStoreVM.getUserLanguage()
    }
}