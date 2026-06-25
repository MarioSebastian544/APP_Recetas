package com.example.app_recetas

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecipeViewModel : ViewModel() {

    private val recetas = listOf(
        Receta(
            id = 1,
            nombre = "Tacos",
            descripcion = "INGREDIENTES:\n• 500g de carne de res (bistec o falda)\n• Tortillas de maíz\n• Cebolla y cilantro picados\n• Limones y salsa al gusto\n\nPREPARACIÓN:\n1. Pica la carne en cubos pequeños y cocínala en una sartén con un poco de aceite, sal y pimienta al gusto hasta que esté dorada.\n2. Calienta las tortillas en un comal.\n3. Sirve la carne sobre las tortillas dobles.\n4. Decora con cebolla, cilantro, unas gotas de limón y tu salsa favorita."
        ),
        Receta(
            id = 2,
            nombre = "Pizza",
            descripcion = "INGREDIENTES:\n• 1 base de masa para pizza pre-cocida\n• 1/2 taza de salsa de tomate\n• 200g de queso mozzarella rallado\n• Ingredientes al gusto (pepperoni, champiñones)\n\nPREPARACIÓN:\n1. Precalienta el horno a 200°C.\n2. Extiende la salsa de tomate de forma uniforme sobre la base de la masa.\n3. Cubre toda la superficie con el queso mozzarella rallado.\n4. Agrega los ingredientes extra que prefieras.\n5. Hornea durante 10-15 minutos o hasta que el queso esté completamente derretido y dorado."
        ),
        Receta(
            id = 3,
            nombre = "Hamburguesa",
            descripcion = "INGREDIENTES:\n• 1 carne para hamburguesa de res\n• 1 pan para hamburguesa\n• 1 rebanada de queso americano\n• Lechuga, jitomate y cebolla\n• Mayonesa, cátsup y mostaza\n\nPREPARACIÓN:\n1. Cocina la carne en una sartén o parrilla caliente durante 3-4 minutos por lado. Justo antes de sacarla, coloca el queso encima para que se derrita.\n2. Unta un poco de mantequilla en el pan y dóralo ligeramente en la sartén.\n3. Arma la hamburguesa untando mayonesa en el pan inferior, coloca la carne con queso, y añade la lechuga, rodajas de jitomate y cebolla.\n4. Agrega cátsup y mostaza al gusto antes de cerrar."
        ),
        Receta(
            id = 4,
            nombre = "Enchiladas",
            descripcion = "INGREDIENTES:\n• 12 tortillas de maíz\n• 1 pechuga de pollo cocida y deshebrada\n• 500ml de salsa verde caliente\n• Crema, queso fresco y cebolla picada\n\nPREPARACIÓN:\n1. Pasa las tortillas rápidamente por una sartén con aceite caliente para que se ablanden sin dorarse.\n2. Rellena cada tortilla con el pollo deshebrado y enróllalas en un plato.\n3. Baña los tacos generosamente con la salsa verde bien caliente.\n4. Decora por encima con un buen chorro de crema, queso fresco espolvoreado y unas rodajas de cebolla."
        ),
        Receta(
            id = 5,
            nombre = "Pozole",
            descripcion = "INGREDIENTES:\n• 500g de carne de cerdo en trozos\n• 1 lata de maíz pozolero precocido\n• 3 chiles guajillo (para el caldo rojo)\n• Lechuga, rábanos, orégano y limones para acompañar\n\nPREPARACIÓN:\n1. Pon a cocer la carne de cerdo en una olla grande con agua, cebolla y ajo hasta que esté suave.\n2. Licúa los chiles guajillo (previamente hidratados en agua caliente) con un poco de caldo y cuélalos dentro de la olla.\n3. Agrega el maíz pozolero bien lavado y deja hervir todo junto por 20 minutos para que se integren los sabores; sazona con sal.\n4. Sirve caliente y acompáñalo en la mesa con lechuga picada, rodajas de rábano, un toque de orégano y limón."
        )
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

