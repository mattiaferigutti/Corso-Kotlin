package challenges

fun main() {

    var result = 0

    val basketItems = mapOf("apples" to 4, "oranges" to 19, "kites" to 3, "sandwiches" to 8)
    val fruits = listOf("apples", "oranges", "pears", "grapes", "bananas")

    for ((item, number) in basketItems) {
        println(number)
        if (item in fruits) result += number
    }

    println("There are $result fruits in the basket")

}