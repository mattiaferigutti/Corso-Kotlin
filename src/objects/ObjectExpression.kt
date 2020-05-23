package objects

open class Person {
    fun eat() = println("I am eating")

    open fun pray() = println("I am praying")
}

fun main() {

    val addOffset = {x : Int -> x + 1}
    println(addOffset(2))
    println(addOffset.invoke(2))

    val coords = object {
        var x = 10
        var y = 10
    }

    val person = object : Person() {
        override fun pray() {
           println("I don't pray")
        }
    }

    person.eat()
    person.pray()
    println(coords.x)

}