package com.corps.movieapp.screens.home

import MovieRow
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.corps.movieapp.model.Movie
import com.corps.movieapp.model.movieList
import com.corps.movieapp.navigation.MovieScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App", color = Color.White) },
                colors = TopAppBarDefaults.smallTopAppBarColors(Color.LightGray),
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation icon click */ }) {
                        Icon(Icons.Filled.Menu, contentDescription = null, tint = Color.White)
                    }
                }
            )
        },
        content = {
            MainContent(navController)
        }
    )
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = movieList()
) {

    Column(modifier = Modifier.padding(top = 80.dp, start = 16.dp, end = 16.dp)) {
        LazyColumn {
            this.items(items = movieList) {
                MovieRow(movie = it) {
                    navController.navigate(route = MovieScreens.DetailScreen.name + "/${it.id}")
                    //Log.d("TAG:MainContent", it)
                }
            }
        }
    }
}
