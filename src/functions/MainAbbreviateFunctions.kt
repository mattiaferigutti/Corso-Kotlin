package functions

fun main() {

    println(power(3))
    printMessage()

}

fun power(x: Int): Int = x * x

fun printMessage() = println("Hello World!")