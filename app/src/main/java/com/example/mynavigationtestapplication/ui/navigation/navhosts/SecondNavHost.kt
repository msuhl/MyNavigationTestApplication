package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.mynavigationtestapplication.ui.navigation.Appdestination
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenFirst
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenSecond

fun NavGraphBuilder.secondGraph(navHostController: NavHostController) {
    navigation<Appdestination.SecondNavGraph>(
        startDestination = Appdestination.SecondNavDestination.SecondAppdestinationFirst
    ) {
        // This is the first screen in the second navigation graph
        composable<Appdestination.SecondNavDestination.SecondAppdestinationFirst> {
            SecondScreenFirst()
        }

        composable<Appdestination.SecondNavDestination.SecondAppdestinationSecond> {
            SecondScreenSecond()
        }
    }
}