package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun MainNavHost(
    navController: NavHostController,
    startDestination: NavGraphRoute,
    modifier:Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = Modifier.then(modifier),
    ) {
        composable<NavGraphRoute.FirstNavGraph> {
            FirstNavHost(rootNavController = navController)
        }

        composable<NavGraphRoute.SecondNavGraph> {
            SecondNavHost(rootNavController = navController)
        }
    }
}