package com.example.mynavigationtestapplication.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed interface TopLevelGraph {
    val title: String
    val icon: ImageVector
}

@Serializable
data object HomeGraph : TopLevelGraph {
    override val title = "Hjem"
    override val icon = Icons.Default.Home
}

@Serializable
data object FirstGraph : TopLevelGraph {
    override val title = "Profil"
    override val icon = Icons.Default.Person
}

@Serializable
data object SecondGraph : TopLevelGraph {
    override val title = "Indstillinger"
    override val icon = Icons.Default.Settings
}

sealed interface Screen {

    //    sealed interface FirstNavDestination : Screen {
    @Serializable
    data object FirstScreenFirst : Screen

    @Serializable
    data object FirstScreenSecond : Screen

    @Serializable
    data object FirstScreenThird : Screen
//    }

    //    sealed interface SecondNavDestination : Screen {
    @Serializable
    data object SecondScreenFirst : Screen

    @Serializable
    data object SecondScreenSecond : Screen

//    }
}