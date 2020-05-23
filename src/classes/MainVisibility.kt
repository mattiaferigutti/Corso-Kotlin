package classes

open class Visb {

    var name = "Giovanni"
    var age = 19

}

class Visbb : Visb() {
    fun takeInfo() {
        super.age
    }
}

fun main() {

    val visb = Visb()
    visb.name
}