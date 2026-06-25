package com.example.app_recetas

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecipeViewModel : ViewModel() {

    private val recetas = listOf(
        Receta(1, "Tacos", "Tacos de carne asada"),
        Receta(2, "Pizza", "Pizza italiana"),
        Receta(3, "Hamburguesa", "Hamburguesa con queso"),
        Receta(4, "Enchiladas", "Enchiladas verdes"),
        Receta(5, "Pozole", "Pozole rojo")
    )

    private val _selectedRecipe =
        MutableStateFlow<Receta?>(null)

    val selectedRecipe: StateFlow<Receta?> =
        _selectedRecipe

    fun getRecipes(): List<Receta> {
        return recetas
    }

    fun selectRecipe(id: Int) {
        _selectedRecipe.value =
            recetas.find { it.id == id }
    }
}