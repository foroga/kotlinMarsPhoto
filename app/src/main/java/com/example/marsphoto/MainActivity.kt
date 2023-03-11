package com.example.marsphoto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarsPhotoTheme {
        MarsPhotoApp()
    }
}