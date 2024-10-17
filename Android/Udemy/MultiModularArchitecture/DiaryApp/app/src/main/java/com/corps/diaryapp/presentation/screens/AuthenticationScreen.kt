package com.corps.diaryapp.presentation.screens

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

@Composable
fun AuthenticationScreen(
    loadingState: Boolean,
    onButtonClicked: () -> Unit
) {
    Surface() {
        AuthenticationContent(
            loadingState = loadingState,
            onButtonClicked = onButtonClicked
        )
    }
}
