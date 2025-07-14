package com.example.mynavigationtestapplication.ui.navigation.navhosts

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynavigationtestapplication.ui.navigation.Screen
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenFirst
import com.example.mynavigationtestapplication.ui.secondscreen.SecondScreenSecond

@Composable
fun SecondNavHost(
    rootNavController: NavHostController
) {
    val frontPageNavController = rememberNavController()

    NavHost(
        navController = frontPageNavController,
        startDestination = Screen.SecondScreenFirst,
    ) {
        composable<Screen.SecondScreenFirst> {
            SecondScreenFirst()
        }
        composable<Screen.SecondScreenSecond> {
            SecondScreenSecond()
        }
    }
}