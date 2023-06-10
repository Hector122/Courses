package com.corps.movieapp.navigation

import java.lang.IllegalArgumentException

enum class MovieScreens {
    HomeScreen, DetailScreen;

    companion object {
        fun fromRouter(router: String?): MovieScreens = when (router?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Router $router is not a valid screen")
        }
    }
}
