package com.example.proyectoapi.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tarjeta(color: Color, textTipo: String, textEuros: String){
    Card(
        modifier = Modifier
            .size(100.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Box(modifier = Modifier
                .size(20.dp)
                .padding(5.dp)
                .background(color = color, shape = RoundedCornerShape(20.dp))
            )
            Text(textTipo, fontSize = 15.sp)
        }


        Text(text = textEuros,
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}