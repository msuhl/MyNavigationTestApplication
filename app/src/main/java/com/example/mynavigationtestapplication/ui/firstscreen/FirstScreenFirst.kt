package com.example.mynavigationtestapplication.ui.firstscreen

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
fun FirstScreenFirst(
    onClickGoToFirstSecondScreen: () -> Unit = { /* Default no-op */ },
    onClickGoToSecondGraph: () -> Unit = { /* Default no-op */ },
    onClickGoFirstThirdScreen: () -> Unit = { /* Default no-op */ },
    onClickGoToSecondSecondScreen: () -> Unit = { /* Default no-op */ },

    ) {
    // This is a placeholder for the first screen of the application.
    // You can add your UI components here.
    // For example, you might want to display a greeting or a welcome message.
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the First Graph, first Screen!",
            style = typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            modifier = Modifier.padding(8.dp),
            onClick = onClickGoToFirstSecondScreen
        ) {
            Text(
                text = "Go to First Second Screen",
                style = typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }
        Button(
            modifier = Modifier.padding(8.dp),
            onClick = onClickGoToSecondGraph
        ) {
            Text(
                text = "Go to Second first Screen",
                style = typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }
        Button(
            modifier = Modifier.padding(8.dp),
            onClick = onClickGoFirstThirdScreen
        ) {
            Text(
                text = "Go to First third Screen",
                style = typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }
        Button(
            modifier = Modifier.padding(8.dp),
            onClick = onClickGoToSecondSecondScreen
        ) {
            Text(
                text = "Go to Second second Screen",
                style = typography.bodyLarge,
                modifier = Modifier.padding(16.dp)
            )
        }

    }
}