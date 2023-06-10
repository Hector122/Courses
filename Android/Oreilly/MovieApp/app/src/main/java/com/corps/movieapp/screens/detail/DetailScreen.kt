package com.corps.movieapp.screens.detail


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
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
import com.corps.movieapp.screens.home.MainContent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieTitle: String = "") {

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

            DetailContent(navController = navController, movieTitle = movieTitle)
        })
}

@Composable
fun DetailContent(navController: NavController, movieTitle: String) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .padding(top = 80.dp) //TODO: How to do it in Scaffold
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Detail Screen: $movieTitle ")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "Go back")
            }
        }
    }
}
