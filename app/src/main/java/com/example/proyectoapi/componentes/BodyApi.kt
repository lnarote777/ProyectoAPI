package com.example.proyectoapi.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BodyApi(){
    val endpoints = listOf(
        Pair("/tipos/nuevo_tipo", "Agregar nuevo tipo"),
        Pair("/gastosDiarios", "Añade un nuevo gasto"),
        Pair("/gastosDiarios/", "Obtiene todos los gastos"),
        Pair("/gastosDiarios/{id}", "Obtiene un gasto por id"),
        Pair("/tipos/delete/{name}", "Elimina un tipo de gasto por su nombre")
    )

    LazyColumn(modifier = Modifier.padding(top = 60.dp)) {
        items(endpoints.count()){ index ->
            val endpoint = endpoints[index]
            EndpointCard(endpoint.first, endpoint.second)
            Spacer(Modifier.height(5.dp))
        }
    }

}