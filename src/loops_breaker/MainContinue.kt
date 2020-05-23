package loops_breaker

fun main() {

    val foods = arrayListOf<String>("apple", "toast", "orange", "pizza", "pasta", "kebab")
    val fruits = arrayListOf<String>("orange", "apple", "strawberry", "pear")

    var fruitCounter = 0

    for (food in foods) {
        if (food !in fruits) {
            println("This is not a fruit")
            continue
        }
        fruitCounter++
        println("Found a fruit!")
    }

    println("Total fruits is: $fruitCounter")

}

class ciao(name: String, nikname: String) {

    fun stampa() {
        println()
    }
}