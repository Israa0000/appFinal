package com.example.appfinal.View

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "LandingActivity"
    ) {
        composable("LandingActivity") {
            val activity = LandingActivity()
            activity.Estructura(navController)
        }

        composable(
            route = "categoria/{name}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                },
            )
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            DetailScreen(name ?: "Sin nombre")
        }
    }
}

@Composable
fun DetailScreen(nombre: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Productos de la categoría: $nombre")
    }
}