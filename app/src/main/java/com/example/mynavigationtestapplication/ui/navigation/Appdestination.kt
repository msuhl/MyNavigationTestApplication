package com.example.mynavigationtestapplication.ui.navigation

import kotlinx.serialization.Serializable

sealed interface Appdestination {

    @Serializable
    data object FirstNavGraph : Appdestination

    @Serializable
    data object SecondNavGraph : Appdestination

    @Serializable
    data object Home : Appdestination


    sealed interface FirstNavDestination : Appdestination {
        @Serializable
        data object FirstAppdestinationFirst : FirstNavDestination

        @Serializable
        data object FirstAppdestinationSecond : FirstNavDestination
    }

    sealed interface SecondNavDestination : Appdestination {
        @Serializable
        data object SecondAppdestinationFirst : SecondNavDestination

        @Serializable
        data object SecondAppdestinationSecond : SecondNavDestination
    }
}