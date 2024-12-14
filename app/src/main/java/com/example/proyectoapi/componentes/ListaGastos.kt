package com.example.proyectoapi.componentes

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ListaGastos(){
    val gastos = listOf(
        Triple("Almuerzo", "12.5€", "2024-12-14"),
        Triple("Taxi", "25.0€", "2024-12-13"),
        Triple("Cine", "15.0€", "2024-12-12"),
        Triple("Supermercado", "€45.30", "2024-12-11"),
        Triple("Gasolina", "€30.0", "2024-12-10"),
        Triple("Entradas Museo", "€18.5", "2024-12-09"),
        Triple("Cena con amigos", "€35.0", "2024-12-08"),
        Triple("Transporte público", "€7.8", "2024-12-07"),
        Triple("Libros", "€20.0", "2024-12-06"),
        Triple("Ropa", "€60.0", "2024-12-05")
    )

    LazyColumn(

    ) {
        items(gastos.count()) { index ->
            val gasto = gastos[index]
            Gasto(name = gasto.first, precio = gasto.second, fecha = gasto.third)
            Spacer(Modifier.height(5.dp))
        }
    }
}