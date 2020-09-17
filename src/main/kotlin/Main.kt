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
            "1" -> println("¡Haz hecho una receta!")
            "2" -> println("""
                Estas son tus recetas
                    >Receta 1
                    >Receta 2
                    >Receta 3
            """.trimIndent())
            "3" -> println("¡Vuelve pronto!")
        }
    } while (response!="3")
}