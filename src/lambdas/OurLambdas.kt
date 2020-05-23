package lambdas

fun main() {

    val number: Int = 5

    val print = { println("Hello") }
    val printString: (String) -> Unit = { println("Hello $it") }

    val addFive: (Int) -> Int = { it + 5 }
    val addFivee = { number: Int -> number + 5 }

    println(addFivee(4))

    val calculation = { x: Double, y: Double -> x + y }
    println(calculation(5.0, 16.0))

}