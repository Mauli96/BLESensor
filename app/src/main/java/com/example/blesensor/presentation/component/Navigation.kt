package com.example.blesensor.presentation.component

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blesensor.presentation.start_screen.StartScreen
import com.example.blesensor.presentation.temperature_humidity_screen.TemperatureHumidityScreen

@Composable
fun Navigation(
    onBluetoothStateChanged: () -> Unit
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.StartScreen.route
    ) {
        composable(Screen.StartScreen.route) {
            StartScreen(navController = navController)
        }

        composable(Screen.TemperatureHumidityScreen.route) {
            TemperatureHumidityScreen()
        }
    }
}

sealed class Screen(val route:String) {
    data object StartScreen : Screen("start_screen")
    data object TemperatureHumidityScreen : Screen("temp_humid_screen")
}