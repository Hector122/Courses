package com.corps.triviaapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.corps.triviaapp.component.Questions

@Composable
fun TriviaHomeScreen(viewModel: QuestionViewModel = hiltViewModel()) {
    Questions(viewModel)
}

@Preview(showBackground = true)
@Composable
fun TriviaHomeScreenPreview() {
    TriviaHomeScreen()
}
