package com.example.proyectoapi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.example.proyectoapi.R
import com.example.proyectoapi.componentes.BodyApi
import com.example.proyectoapi.componentes.HeaderApi


@Composable
fun ApiScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.portada))
    ){
         HeaderApi(navController)
         BodyApi()
    }
}