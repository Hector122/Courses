package com.corps.diaryapp.navigation

sealed class Screen(val route: String) {
    data object Authentication: Screen("authentication_screen")
    data object Home: Screen("home_screen")
    data object Write: Screen("write_screen?diaryId={diaryId}") {
        fun passDiaryId(diaryId: String) = "write_screen?$diaryId"
    }
}
