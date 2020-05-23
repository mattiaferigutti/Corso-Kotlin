package classes

class SecondPerson(var name: String?) {

    var lastName: String? = null

    init {
        println("Person's name is $name")
    }

    constructor(name: String?, lastName_param: String?, age: Int?) : this(name) {
        println("name: $name, lastname: $lastName_param, age: $age")
        lastName = lastName_param
    }

    fun ciao() {

    }
}

fun main() {
    val sp = SecondPerson("Marco", "Rossi", 20)
}