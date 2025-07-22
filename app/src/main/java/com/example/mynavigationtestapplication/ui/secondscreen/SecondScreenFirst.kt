package com.example.mynavigationtestapplication.ui.secondscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreenFirst(onClickGoToSecondSecondScreen: () -> Unit) {
    // This is a placeholder for the first screen of the application.
    // You can add your UI components here.
    // For example, you might want to display a greeting or a welcome message.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome to the Second Graph, first Screen!",
                style = typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            Button(
                modifier = Modifier.padding(8.dp),
                onClick = onClickGoToSecondSecondScreen
            ) {
                Text(
                    text = "Go to Second Second Screen",
                    style = typography.bodyLarge,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}