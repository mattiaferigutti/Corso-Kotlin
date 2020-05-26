package challenges

import kotlin.math.PI
import kotlin.math.pow

class Circle {

    private var radius: Double? = null

    fun getValue() {
        println("Insert the radius value: ")
        val stringInput = readLine()!!

        try {
            radius = stringInput.toDouble()
            println("The area is ${area()}")
            println("The circumference is ${circumference()}")
        } catch (e: NumberFormatException) {
            println("Insert a number")
            getValue()
        }
    }

    private fun area() : Double {
        return PI * radius!!.pow(2)
    }

    private fun circumference() : Double {
        return 2 * radius!! * PI
    }
}

fun main() {
    val circle = Circle()
    circle.getValue()
}