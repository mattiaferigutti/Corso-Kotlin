package loops

fun main() {

    val map = mapOf(30 to "Marco", 20 to "Anna", 40 to "Micheal", 50 to "Alfredo")

    println("map loop")
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }

    val nameList = listOf<String>("Marco", "Anna", "Micheal", "Alfredo")

    println("\nlist loop")
    for (name in nameList) {
        println(name)
    }

    println("\nrange loop")
    for (i in 1..10)
        println(i)

    println("\nuntil loop")
    for (i in 1 until 10)
        println(i)

    println("\ndownTo loop")
    for (i in 15 downTo 1)
        println(i)


    println("\nstep loop")
    for (i in 1..10 step 2)
        println(i)

}