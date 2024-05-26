package com.corps.weatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.corps.weatherforecast.screens.WeatherSplashScreen

@Composable
fun WeatherNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = WeatherScreens.SplashScreen.name,
        builder = {
            composable(WeatherScreens.SplashScreen.name) {
                WeatherSplashScreen(navController)
            }
        }
    )
}
