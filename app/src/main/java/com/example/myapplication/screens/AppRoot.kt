package com.example.myapplication.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppRoot() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first") {
        composable("first") {
            FirstScreen(navController)
        }

        composable("second") {
            SecondScreen(navController)
        }
    }


}