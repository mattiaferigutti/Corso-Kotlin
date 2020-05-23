package classes

@JvmOverloads fun fixSomething(objectThing: String = "car", time: Long = 100_000_000L) {

}

data class Event @JvmOverloads constructor(var name: String = "'90 party",
                                           var date: String = "10/09/2020",
                                           var isPrivate: Boolean = false)

fun main() {
    fixSomething()
    fixSomething("Table")
    fixSomething(time = 1000L)
}