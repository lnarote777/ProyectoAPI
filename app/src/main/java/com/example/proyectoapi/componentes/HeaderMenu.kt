package com.example.proyectoapi.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapi.R


@Composable
fun HeaderMenu(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
            .height(200.dp)
            .background(color = colorResource(R.color.boton_portada))
    ) {

        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, end = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Menú",
                tint = Color.White,
                modifier = Modifier.size(30.dp)
                    .clickable {  }
            )

            Spacer(Modifier.width(30.dp))

            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "Menú",
                tint = Color.White,
                modifier = Modifier.size(30.dp)
                    .clickable {  }
            )
        }


        Carrusel()


    }
}