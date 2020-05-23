package collections

fun main() {
    val ml = mutableListOf(1, 2, 3)

    println(ml.contains(2))
    println(ml.indexOf(1))

    //ml.add(4)
    ml.add(0, 4)
    //ml.remove(3)
    ml.removeAt(1)
    ml.set(0, 8)

    ml.sort()
    ml.reverse()
    ml.shuffle()

    println("printing all items")
    for (item in ml) {
        println(item)
    }

}