package com.example.mynavigationtestapplication.ui.navigation

import kotlinx.serialization.Serializable

sealed interface NavGraphRoute {
    @Serializable
    data object FirstNavGraph : NavGraphRoute

    @Serializable
    data class SecondNavGraph(val screenRoute:String? = null) : NavGraphRoute
}