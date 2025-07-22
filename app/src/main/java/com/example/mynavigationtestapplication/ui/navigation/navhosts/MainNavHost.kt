package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mynavigationtestapplication.ui.Home
import com.example.mynavigationtestapplication.ui.navigation.FirstGraph
import com.example.mynavigationtestapplication.ui.navigation.HomeGraph
import com.example.mynavigationtestapplication.ui.navigation.Screen
import com.example.mynavigationtestapplication.ui.navigation.SecondGraph

@Composable
fun MainNavHost(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = FirstGraph,
    ) {
//        composable<HomeGraph> {
//            Home(
//                onClickGoToFirstFirstScreen = { navHostController.navigate(Screen.FirstScreenFirst) },
//                onClickGoToFirstSecondScreen = { navHostController.navigate(Screen.FirstScreenSecond) },
//                onClickGoToSecondFirstScreen = { navHostController.navigate(SecondGraph) },
//                onClickGoToSecondSecondScreen = { navHostController.navigate(Screen.SecondScreenSecond) }
//            )
//        }
        firstGraph(navHostController = navHostController)
        secondGraph(navHostController = navHostController)
    }
}





