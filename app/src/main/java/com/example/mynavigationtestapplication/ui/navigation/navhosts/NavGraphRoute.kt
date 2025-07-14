package com.example.mynavigationtestapplication.ui.navigation.navhosts

import kotlinx.serialization.Serializable

sealed interface NavGraphRoute {
    @Serializable
    data object FirstNavGraph : NavGraphRoute

    @Serializable
    data object SecondNavGraph : NavGraphRoute
}