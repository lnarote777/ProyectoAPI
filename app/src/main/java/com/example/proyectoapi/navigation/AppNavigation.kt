package com.example.proyectoapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoapi.screens.ApiScreen
import com.example.proyectoapi.screens.MenuScreen
import com.example.proyectoapi.screens.PortadaScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.PortadaScreen.route){
        composable(AppScreen.PortadaScreen.route){
            PortadaScreen(navController)
        }

        composable(AppScreen.MenuScreen.route){
            MenuScreen(navController)
        }

        composable(AppScreen.ApiScreen.route){
            ApiScreen(navController)
        }

    }
}
