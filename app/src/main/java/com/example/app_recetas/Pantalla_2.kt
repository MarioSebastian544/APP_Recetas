package com.example.app_recetas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(
    idReceta: Int,
    viewModel: RecipeViewModel
) {
    val receta = viewModel.getRecipes().find { it.id == idReceta }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = receta?.nombre ?: "Sin receta",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = receta?.descripcion ?: ""
        )
    }
}