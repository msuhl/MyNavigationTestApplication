package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenFirst
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenSecond
import com.example.mynavigationtestapplication.ui.navigation.Appdestination

fun NavGraphBuilder.firstGraph(navHostController: NavHostController) {
    navigation<Appdestination.FirstNavGraph>(
        startDestination = Appdestination.FirstNavDestination.FirstAppdestinationFirst
    ) {
        composable<Appdestination.FirstNavDestination.FirstAppdestinationFirst> {
            FirstScreenFirst(
                onClickGoToFirstSecondScreen = { navHostController.navigate(Appdestination.FirstNavDestination.FirstAppdestinationSecond) },
                onClickGoToSecondFirstScreen = { navHostController.navigate(Appdestination.SecondNavGraph) },
                onClickGoToSecondSecondScreen = { navHostController.navigate(Appdestination.SecondNavDestination.SecondAppdestinationSecond) }
            )
        }
        composable<Appdestination.FirstNavDestination.FirstAppdestinationSecond> {
            FirstScreenSecond()
        }
    }
}