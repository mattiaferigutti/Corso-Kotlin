package challenges

import kotlin.math.pow

enum class Shape {
    TRIANGLE,
    SQUARE,
    PENTAGON,
    HEXAGON,
    HEPTAGON,
    OCTAGON,
    NONAGON,
    DECAGON,
    UNKNOWN
}

interface PolygonBehaviour {
    fun perimeter() : Double
    fun area(): Double
    fun shape(vararg side: Double): Shape
}

abstract class Polygon : PolygonBehaviour {
    override fun perimeter() : Double {
        return 0.0
    }

    override fun area() : Double {
        return 0.0
    }

    override fun shape(vararg sides: Double): Shape {
        return when (sides.size) {
            3 -> Shape.TRIANGLE
            4 -> Shape.SQUARE
            5 -> Shape.PENTAGON
            6 -> Shape.HEXAGON
            7 -> Shape.HEPTAGON
            8 -> Shape.OCTAGON
            9 -> Shape.NONAGON
            10 -> Shape.DECAGON
            else -> Shape.UNKNOWN
        }
    }
}

/**
 * We've handled only square and rectangle, but we should have managed trapezoid, parallelogram,
 * rhombus and kite also since all of them have 4 sides
 */
class Square(
    private val side1: Double,
    private val side2: Double,
    private val side3: Double,
    private val side4: Double) : Polygon() {

    private val isSquare = side1 == side2 && side2 == side3 && side3 == side4 &&side4 == side1

    init {
        doubleArrayOf(side1, side2, side3, side4).forEachIndexed { i, side ->
            require(side > 0)  {
                "The $i side has value $side <= 0"
            }
        }
    }

    override fun perimeter(): Double {
        return side1 + side2 + side3 + side4
    }

    override fun area(): Double {
        return if (isSquare) {
            side1.pow(2)
        } else {
            val minValue = doubleArrayOf(side1, side2, side3, side4).min()
            val maxValue = doubleArrayOf(side1, side2, side3, side4).max()
            minValue!! * maxValue!!
        }
    }

    override fun shape(vararg sides: Double): Shape {
        return super.shape(side1, side2, side3, side4)
    }
}

//We can define others polygons
//You can also add some other methods such as diagonal

fun main() {
    val square = Square(5.0, 10.0, 5.0, 10.0)
    println(square.shape().name)
    println(square.perimeter())
    println(square.area())
}
