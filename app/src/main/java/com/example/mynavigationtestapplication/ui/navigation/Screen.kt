package com.example.mynavigationtestapplication.ui.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {
    @Serializable
    data object FirstScreenFirst : Screen

    @Serializable
    data object SecondScreenFirst : Screen

    @Serializable
    data object FirstScreenSecond : Screen

    @Serializable
    data object SecondScreenSecond : Screen
}