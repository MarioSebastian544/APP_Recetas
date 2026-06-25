package com.example.app_recetas

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.items

@Composable
fun Pantalla_principal(
    navController: NavController,
    viewModel: RecipeViewModel
) {

    val recetas = viewModel.getRecipes()

    LazyColumn {

        items(recetas) { receta ->

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {

                        viewModel.selectRecipe(receta.id)

                        navController.navigate(
                            "detail/${receta.id}"
                        )
                    }
            ) {

                Text(
                    text = receta.nombre,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}