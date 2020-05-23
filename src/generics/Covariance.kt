package generics

fun main() {

    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    //convertToInt(shortList)

}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }

    collection.add(25.9)
}

/*fun waterRoseGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose : Flower() {

}

class Garden<out T: Flower> {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]

}*/