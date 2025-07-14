package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenFirst
import com.example.mynavigationtestapplication.ui.firstscreen.FirstScreenSecond
import com.example.mynavigationtestapplication.ui.navigation.Screen

@Composable
fun FirstNavHost(rootNavController: NavHostController) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.FirstScreenFirst,
    ) {
        composable<Screen.FirstScreenFirst> {
            FirstScreenFirst(
                onClickGoToFirstSecondScreen = { navController.navigate(Screen.FirstScreenSecond) },
                onClickGoToSecondFirstScreen = { rootNavController.navigate(NavGraphRoute.SecondNavGraph) },
                onClickGoToSecondSecondScreen = { navController.navigate(Screen.FirstScreenSecond) }
            )
        }
        composable<Screen.FirstScreenSecond> {
            FirstScreenSecond()
        }
    }
}