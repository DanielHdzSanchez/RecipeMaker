fun main(args: Array<String>) {
    println("Bienvenido a Recipe Maker")
    do
    {
        println("\nSelecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
        val response: String? = readLine()
        when (response)
        {
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("¡Vuelve pronto!")
        }
    } while (response!="3")
}

fun makeRecipe()
{
    do {
        println("Hacer receta")
        val ingredients = listOf<String>("Agua", "Leche", "Carne",
                "Verduras", "Frutas", "Ceral", "Huevos", "Aceites")
        for((index, ingredient) in ingredients.withIndex())
        {
            println("${index.plus(1)}. $ingredient")
        }
        val response = readLine()
    } while (response in 1..8)
}

fun viewRecipe()
{
    println("Ver mis recetas")
}