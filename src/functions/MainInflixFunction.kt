package functions

fun main() {

    val x = 5 add 3
    println(x)
}

infix fun Int.add(b: Int) : Int {
    return this + b
}