fun main() {
    printMenu()
}

fun makeRecipe(recipe:MutableList<String>){

    val makeRecipeMenu = """
        
            :: Make recipe ::
             
            Select the ingredient you are looking for by category
             1. Water
             2. Milk
             3. Meat
             4. Vegetables
             5. Fruits
             6. Cereal
             7. Eggs
             8. Oil
             9. Return to main menu
        """.trimIndent()

    do{
        println(makeRecipeMenu)
        val response:String? = readLine()

        when(response){
            "1" -> {recipe.add("Water")
                    println("Water added to the recipe")}
            "2" -> {recipe.add("Milk")
                println("Milk added to the recipe")}
            "3" -> {recipe.add("Meat")
                println("Meat added to the recipe")}
            "4" -> {recipe.add("Vegetables")
                println("Vegetables added to the recipe")}
            "5" -> {recipe.add("Fruits")
                println("Fruits added to the recipe")}
            "6" -> {recipe.add("Cereal")
                println("Cereal added to the recipe")}
            "7" -> {recipe.add("Eggs")
                println("Eggs added to the recipe")}
            "8" -> {recipe.add("Oil")
                println("Oil added to the recipe")}
            "9" -> println("Exiting")
            else -> println("Choose a valid option")
        }
    }while (!(response?.equals("9") ?: (response === null)))

}

fun printMenu(){
    val menu = """
        
            :: Welcome to recipe maker ::
             
             Choose an option
             1. Make a recipe
             2. View my recipe
             3. Exit   
        """.trimIndent()

   val recipe = mutableListOf<String>()

    do{
        println(menu)
        val response:String? = readLine()
        when(response){
            "1" -> makeRecipe(recipe)
            "2" -> viewRecipe(recipe)
            "3" -> println("Exiting")
            else -> println("Choose a valid option")
        }
    }while (!(response?.equals("3") ?: (response === null)))
}

fun viewRecipe(recipe: List<String>){
    println("You have the following recipes")
    for (ingredient in recipe) println(ingredient)
}