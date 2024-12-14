package com.example.proyectoapi.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoapi.R
import org.w3c.dom.Text

@Composable
fun Gasto(name: String, precio: String, fecha: String){
    Column (modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(R.color.fondo_gasto))
    ) {
        Text(
            text = fecha,
            fontSize = 30.sp,
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(precio,
                fontSize = 30.sp,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(name,
                fontSize = 30.sp,
                modifier = Modifier.padding(end = 20.dp)
            )
        }

    }
}