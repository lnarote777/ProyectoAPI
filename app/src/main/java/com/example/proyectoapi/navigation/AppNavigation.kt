package com.example.proyectoapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectoapi.screens.MenuScreen
import com.example.proyectoapi.screens.PortadaScreen
import com.example.proyectoapi.screens.UserScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.PortadaScreen.route){
        composable(AppScreen.PortadaScreen.route){
            PortadaScreen(navController)
        }

        composable(
            AppScreen.MenuScreen.route
        ){
            MenuScreen()
        }

        composable(
            AppScreen.UserScreen.route+ "/{user}",
            arguments = listOf(navArgument(name = "user"){
                type = NavType.StringType
            })
        ){
            UserScreen(navController, it.arguments?.getString("user"))
        }

    }
}
