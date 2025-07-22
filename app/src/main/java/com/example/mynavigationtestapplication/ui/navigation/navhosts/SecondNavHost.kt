package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenThird
import com.example.mynavigationtestapplication.ui.navigation.Screen
import com.example.mynavigationtestapplication.ui.navigation.SecondGraph
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenFirst
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenSecond

fun NavGraphBuilder.secondGraph(navHostController: NavHostController) {
    navigation<SecondGraph>(
        startDestination = Screen.SecondScreenFirst
    ) {
        // This is the first screen in the second navigation graph
        composable<Screen.SecondScreenFirst> {
            SecondScreenFirst(
                onClickGoToSecondSecondScreen = { navHostController.navigate(Screen.SecondScreenSecond) },
                )
        }

        composable<Screen.SecondScreenSecond> {
            SecondScreenSecond(
                onClickGoToFirstThirdScreen = { navHostController.navigate(Screen.FirstScreenThird) },

                )
        }
        composable<Screen.FirstScreenThird> {
            FirstScreenThird()
        }
    }
}