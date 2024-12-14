package com.example.proyectoapi.navigation

sealed class AppScreen (val route: String) {
    object PortadaScreen: AppScreen("PortadaScreen")
    object MenuScreen: AppScreen("MenuScreen")
    object UserScreen: AppScreen("UserScreen")
}