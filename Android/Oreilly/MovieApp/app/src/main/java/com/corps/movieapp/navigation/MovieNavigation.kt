package com.corps.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.corps.movieapp.screens.detail.DetailsScreen
import com.corps.movieapp.screens.home.HomeScreen


@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {

        composable(MovieScreens.HomeScreen.name) {
            //here we pass were we want to go
            HomeScreen(navController = navController)
        }

        //www.google.com/person/detail-screen/id=34
        composable(
            route = MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        ) { backStackEntry ->
            backStackEntry.arguments?.getString("movie")?.let {
                DetailsScreen(navController = navController, it)
            }
        }
    }
}
