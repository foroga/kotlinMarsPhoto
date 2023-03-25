package com.example.marsphoto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.marsphoto.ui.MarsPhotoApp
import com.example.marsphoto.ui.theme.MarsPhotoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarsPhotoTheme {
                MarsPhotoApp()
            }
        }
    }
}


