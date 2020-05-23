package loops

fun main() {

    var num = 2
    var i = 1

    do {
        println("2 * $i = ${num * i}")
        i++
    } while (i <= 10)
}