class Menu {
    
    fun printmenu(){
        val menu = """
        
            :: Welcome to recipe maker ::
             
             Choose an option
             1. Make a receipt 
             2. Show my receipts
             3. Exit   
        """.trimIndent()


        do{
            println(menu)
            val response:String? = readLine()

            when(response){
                "1" -> println("Option 1 chosen")
                "2" -> println("Option 2 chosen")
                "3" -> println("Exiting")
                else -> println("Choose a valid option")
            }
        }while (!(response?.equals("3") ?: (response === null)))
    }
}