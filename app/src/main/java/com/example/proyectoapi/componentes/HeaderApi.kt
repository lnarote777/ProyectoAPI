package com.example.proyectoapi.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectoapi.R
import com.example.proyectoapi.navigation.AppScreen

@Composable
fun HeaderApi(navController: NavController){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .padding(top = 30.dp)
            .height(90.dp)
            .background(color = colorResource(R.color.boton_portada))
    ) {
        Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Atrás",
            tint = Color.White,
            modifier = Modifier.size(40.dp).clickable {
                navController.navigate(route = AppScreen.MenuScreen.route)
            }
        )

        Spacer(Modifier.width(140.dp))

        Text("API",
            fontSize = 40.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}