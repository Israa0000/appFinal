package com.example.appfinal.View

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appfinal.R
import com.example.appfinal.View.ui.theme.AppFinalTheme

class LandingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFinalTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }

    @Composable
    fun Estructura(modifier: Modifier = Modifier) {
        var busqueda by remember { mutableStateOf("") }
        var filtro = R.drawable.icono_filtro
        var promPrincipal = R.drawable.bg_compose_background


        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                NumberTextField(
                    label = "Buscar...",
                    value = busqueda,
                    onValueChange = { busqueda = it },
                    modifier = Modifier.width(300.dp).padding(end = 8.dp)
                )
                Image(
                    painter = painterResource(id = filtro),
                    contentDescription = "filtro",
                    modifier = Modifier.size(45.dp)
                        .padding(start = 10.dp,top = 10.dp )

                )
            }

            Image(
                painter = painterResource(id = promPrincipal),
                contentDescription = "promPrincipal",
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 10.dp)
            )


        }
    }

    @Composable
    fun item(imagen : Image, nombre : String, precio : String, precioAnterior : String){
        Image(
            painter = painterResource(id = imagen),
            contentDescription = "imagen",
            modifier = Modifier.size(150.dp)
                .padding(end = 10.dp)
        )

    }

    @Composable
    fun NumberTextField(label : String, value : String, onValueChange : (String) -> Unit,modifier : Modifier = Modifier){//hacemos el proceso de abstraccion con esta funcion

        TextField(
            label = {
                Text(
                    text = label
                )
            },
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier,
        )
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        AppFinalTheme {
            Estructura()
        }
    }
}
