package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenFirst
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenSecond
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenThird
import com.example.mynavigationtestapplication.ui.navigation.FirstGraph
import com.example.mynavigationtestapplication.ui.navigation.Screen
import com.example.mynavigationtestapplication.ui.navigation.SecondGraph

fun NavGraphBuilder.firstGraph(navHostController: NavHostController) {
    navigation<FirstGraph>(
        startDestination = Screen.FirstScreenFirst
    ) {
        composable<Screen.FirstScreenFirst> {
            FirstScreenFirst(
                onClickGoToFirstSecondScreen = { navHostController.navigate(Screen.FirstScreenSecond) },
                onClickGoToSecondGraph = { navHostController.navigate(SecondGraph) },
                onClickGoFirstThirdScreen = { navHostController.navigate(Screen.FirstScreenThird) },
                onClickGoToSecondSecondScreen = { navHostController.navigate(Screen.SecondScreenSecond) }
            )
        }
        composable<Screen.FirstScreenSecond> {
            FirstScreenSecond(
                onClickGoToFirstThirdScreen = { navHostController.navigate(Screen.FirstScreenThird) },
                )
        }
        composable<Screen.FirstScreenThird> {
            FirstScreenThird()
        }
    }
}