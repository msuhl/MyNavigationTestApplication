package com.example.mynavigationtestapplication.ui.secondscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreenFirst() {
    // This is a placeholder for the first screen of the application.
    // You can add your UI components here.
    // For example, you might want to display a greeting or a welcome message.
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Welcome to the Second first Screen!",
            style = typography.headlineSmall,
            modifier = Modifier.padding(16.dp)
        )
    }
}