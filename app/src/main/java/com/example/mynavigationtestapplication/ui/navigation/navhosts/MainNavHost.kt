package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mynavigationtestapplication.ui.Home
import com.example.mynavigationtestapplication.ui.navigation.Appdestination
import com.example.mynavigationtestapplication.ui.navigation.NavGraphRoute

@Composable
fun MainNavHost(
    navHostController: NavHostController,
) {
    NavHost(
        navController = navHostController,
        startDestination = Appdestination.Home,
    ) {
        composable<Appdestination.Home> {
            Home(
                onClickGoToFirstFirstScreen = { navHostController.navigate(Appdestination.FirstNavDestination.FirstAppdestinationFirst) },
                onClickGoToFirstSecondScreen = { navHostController.navigate(Appdestination.FirstNavDestination.FirstAppdestinationSecond) },
                onClickGoToSecondFirstScreen = { navHostController.navigate(Appdestination.SecondNavGraph) },
                onClickGoToSecondSecondScreen = { navHostController.navigate(Appdestination.SecondNavDestination.SecondAppdestinationSecond) }
            )
        }
        firstGraph(navHostController = navHostController)
        secondGraph(navHostController = navHostController)
    }
}





