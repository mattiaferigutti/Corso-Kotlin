package challenges

class Triangle(private val a: Double, private val b: Double,private val c: Double) {
    init {
        doubleArrayOf(a, b, c).run {
            forEachIndexed { i, side ->
                require(side > 0) {
                    "Side ${i+1} has value $side < 0" //throw an exception
                }
            }
        }
    }
    val isEquilateral = a == b && b == c && a > 0
    val isIsosceles = a == b || a == c || b == c
    val isScalene = a != b && b != c && c != a

    fun getInfoTriangle() {
        when {
            isEquilateral -> println("The triangle is Equilateral")
            isIsosceles -> println("The triangle is Isosceles")
            isScalene -> println("The triangle is Scalene")
        }
    }
}

fun main() {
    val triangle = Triangle(10.0, 10.0, 10.0)
    triangle.getInfoTriangle()
}