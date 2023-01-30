package com.mpfcoding.zommer_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mpfcoding.zommer_app.ui.theme.Zommer_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Zommer_appTheme {

            }
        }
    }
}