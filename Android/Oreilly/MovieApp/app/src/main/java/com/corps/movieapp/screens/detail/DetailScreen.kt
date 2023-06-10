package com.corps.movieapp.screens.detail


import MovieRow
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.corps.movieapp.model.Movie
import com.corps.movieapp.model.movieList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieId: String?) {
    val newMovieList = movieList().filter { movie ->
        movie.id == movieId
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App", color = Color.White) },
                colors = TopAppBarDefaults.smallTopAppBarColors(Color.LightGray),
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation icon click */
                        navController.popBackStack()
                    }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = null, tint = Color.White)
                    }
                }
            )
        },
        content = {

            DetailContent(navController = navController, movie = newMovieList[0])
        })
}

@Composable
fun DetailContent(navController: NavController, movie: Movie) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 80.dp) //TODO: How to do it in Scaffold
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Detail Screen: ${movie.title}")

            MovieRow(movie)

            Spacer(modifier = Modifier.height(20.dp))

            HorizontalScrollableImageView(movie)
        }
    }
}

@Composable
private fun HorizontalScrollableImageView(movie: Movie) {
    LazyRow {
        items(movie.images) { image ->
            Card(
                modifier = Modifier
                    .padding(12.dp)
                    .size(240.dp), elevation = CardDefaults.cardElevation(5.dp)
            ) {
                AsyncImage(model = image, contentDescription = "image")
            }
        }
    }
}
