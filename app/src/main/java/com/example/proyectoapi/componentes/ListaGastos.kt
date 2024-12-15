package com.example.proyectoapi.componentes

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListaGastos(){
    val gastos = listOf(
        Triple("Almuerzo", "12.5€", "2024-12-14"),
        Triple("Taxi", "25.0€", "2024-12-13"),
        Triple("Cine", "15.0€", "2024-12-12"),
        Triple("Supermercado", "45.30€", "2024-12-11"),
        Triple("Gasolina", "30.0€", "2024-12-10"),
        Triple("Entradas Museo", "18.5€", "2024-12-09"),
        Triple("Cena con amigos", "35.0€", "2024-12-08"),
        Triple("Transporte público", "7.8€", "2024-12-07"),
        Triple("Libros", "20.0€", "2024-12-06"),
        Triple("Ropa", "60.0€", "2024-12-05"),
        Triple("Cafetería", "5.0€", "2024-12-04"),
        Triple("Regalo", "25.5€", "2024-12-03"),
        Triple("Reparación teléfono", "75.0€", "2024-12-02"),
        Triple("Suscripción mensual", "9.99€", "2024-12-01"),
        Triple("Mantenimiento hogar", "40.0€", "2024-11-30"),
        Triple("Comida rápida", "8.0€", "2024-11-29"),
        Triple("Mercado", "38.75€", "2024-11-28"),
        Triple("Concierto", "55.0€", "2024-11-27"),
        Triple("Suscripción streaming", "14.99€", "2024-11-26")
    )

    LazyColumn{
        items(gastos.count()) { index ->
            val gasto = gastos[index]
            Gasto(name = gasto.first, precio = gasto.second, fecha = gasto.third)
            Spacer(Modifier.height(5.dp))
        }
    }
}