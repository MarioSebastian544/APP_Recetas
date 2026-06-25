package com.example.app_recetas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation(
    viewModel: RecipeViewModel,
    modifier: Modifier = Modifier
) {

    val navController =
        rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {

            Pantalla_principal(
                navController,
                viewModel
            )
        }

        composable(
            route = "detail/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {

            DetailScreen(viewModel)
        }
    }
}