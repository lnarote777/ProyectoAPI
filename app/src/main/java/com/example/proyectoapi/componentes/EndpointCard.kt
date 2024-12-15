package com.example.proyectoapi.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun EndpointCard(texto: String, descripcion: String){
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable {  },
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text(texto, fontWeight = FontWeight.SemiBold)
            Spacer(Modifier.height(4.dp))
            Text(descripcion)
        }
    }
}