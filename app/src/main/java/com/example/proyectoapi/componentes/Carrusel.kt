package com.example.proyectoapi.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectoapi.R

@Preview
@Composable
fun Carrusel(){
    val tarjetas = listOf(
        Triple(Color.Blue, "Ocio", "12.46€"),
        Triple(Color.Blue, "Ocio", "14.00€"),
        Triple(Color.Magenta, "Comida", "3.80€"),
        Triple(Color.Magenta, "Comida", "8.00€"),
        Triple(Color.Magenta, "Comida", "10.50€"),
        Triple(colorResource(R.color.orange), "Transporte", "2.99€"),
        Triple(colorResource(R.color.purple_200), "Manualidades", "1.80€"),
        Triple(Color.Blue, "Ocio", "12.46€"),
        Triple(Color.Blue, "Ocio", "12.46€"),
        Triple(Color.Blue, "Ocio", "12.46€"),
        Triple(Color.Blue, "Ocio", "12.46€"),
        Triple(Color.Blue, "Ocio", "12.46€")
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp),
        contentPadding = PaddingValues(horizontal = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(tarjetas.count()) { index ->
            val tarjeta = tarjetas[index]
            Tarjeta(color = tarjeta.first, textTipo = tarjeta.second, textEuros = tarjeta.third)
        }
    }

}