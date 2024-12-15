package com.example.proyectoapi.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.proyectoapi.componentes.HeaderApi


@Composable
fun ApiScreen(navController: NavController){
    Column {
         HeaderApi(navController)
//        BodyApi()
    }
}