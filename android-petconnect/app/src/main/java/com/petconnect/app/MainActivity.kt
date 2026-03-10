package com.petconnect.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.petconnect.app.ui.screens.RegisterScreen
import com.petconnect.app.ui.theme.PetConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetConnectTheme {
                RegisterScreen()
            }
        }
    }
}
