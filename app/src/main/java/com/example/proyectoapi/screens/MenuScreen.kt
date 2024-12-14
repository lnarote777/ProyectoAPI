package com.example.proyectoapi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.example.proyectoapi.R
import com.example.proyectoapi.componentes.HeaderMenu
import com.example.proyectoapi.componentes.ListaGastos


@Composable
fun MenuScreen(){
    Column(Modifier
        .fillMaxSize()
       .background(color = colorResource(R.color.portada))
    ) {
        HeaderMenu()
        ListaGastos()
    }
}
