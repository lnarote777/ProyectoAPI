package com.example.proyectoapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectoapi.navigation.AppNavigation
import com.example.proyectoapi.ui.theme.ProyectoAPITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoAPITheme {
                AppNavigation()
            }
        }
    }
}
