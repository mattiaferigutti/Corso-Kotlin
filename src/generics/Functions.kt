package generics

fun main() {

    val nameArray = arrayListOf<String>("Marco", "Giulia", "John", "Giuseppe")
    nameArray.printCollection2()

    val numberArray = arrayListOf<Int>(1, 2, 3, 4, 5)
    numberArray.printCollection2()

}

fun <T> ArrayList<T>.printCollection2() {
    for (item in this) {
        println(item)
    }
}

fun <T> printCollection(collection: ArrayList<T>) {
    for (item in collection) {
        println(item)
    }
}