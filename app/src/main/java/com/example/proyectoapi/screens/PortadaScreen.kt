package com.example.proyectoapi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.proyectoapi.R
import com.example.proyectoapi.navigation.AppScreen


@Composable
fun PortadaScreen(navController: NavController){
    var showLoadingScreen by rememberSaveable { mutableStateOf(false) }

    // Cambia el estado después de 3 segundos
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(5000)
        navController.navigate(route = AppScreen.MenuScreen.route)
    }

    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.portada))
    ) {

        Spacer(Modifier.weight(0.1f))

        Image(
            painter = painterResource(R.drawable.icon),
            contentDescription = "Icono app",
            Modifier.size(350.dp)
        )
        Spacer(Modifier.weight(0.1f))

        Text(
            text = "FinanzApp",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = colorResource(R.color.boton_portada)
        )
        
        Text(
            text = "Gestion inteligente de gastos diarios",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = colorResource(R.color.texto)
        )

        Spacer(Modifier.weight(0.5f))

        if (showLoadingScreen){
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 30.dp),
                color = Color.Red,
                trackColor = Color.White
            )
        } else {
            Button(
                onClick = {showLoadingScreen = true},
                modifier = Modifier
                    .width(350.dp)
                    .height(60.dp),
                colors = ButtonColors(
                    containerColor = colorResource(R.color.boton_portada),
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.DarkGray
                )
            ) { Text("Comienza a gestionar tus gastos",
                fontSize = 20.sp) }
        }

        Spacer(Modifier.weight(0.2f))
    }
}




