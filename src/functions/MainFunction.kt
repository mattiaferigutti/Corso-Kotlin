package functions

import kotlin.math.asin

fun main() {
    //eat("apple")
    val result: Int = multiplication(5, 5)
    //print(result)

    val PI = Math.PI
    asin(5.5)

    val a = 5.power()
    println(a)

    "Hello World!".print()
}

fun String.print() {
    println(this)
}

fun Int.power() : Int {
    return this * this
}

fun multiplication(a: Int, b: Int) : Int {
    return a * b
}

fun eat(typeOfFood: String?) : Unit {
    println("You're gonna eat $typeOfFood")
}