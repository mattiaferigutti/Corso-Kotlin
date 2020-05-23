package nulls

val number: Float by lazy {
    98.9f
}

fun main() {
    println("some code...")

    val result1 = number * 5 * 10

    val result2 = number * 5 * 20

    println("some more code...")
}