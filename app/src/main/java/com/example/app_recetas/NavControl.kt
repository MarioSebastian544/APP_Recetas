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
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "principal",
        modifier = modifier
    ) {
        composable("principal") {
            Pantalla_principal(navController = navController, viewModel = viewModel)
        }


        composable("detail/{id}") { backStackEntry ->

            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: 0


            DetailScreen(idReceta = id, viewModel = viewModel)
        }
    }
}