package lambdas

class Person {
    var name: String = "Marco"
    var contactNumber: String = "123456789"
    fun displayInfo() = println("\nName: $name\nContact: $contactNumber")
}

fun main() {

    val string = "abc"

    /*string.let {
        println("The original string is $it")
        it.reversed()
    } .let {
        println("The reverse string is $it")
    }*/

    string.also {
        println("The original string is $it")
        it.reversed()
    } .also {
        println("The reverse string is $it")
    }

    val person = Person().apply {
        name = "Claraasass"
        contactNumber = "72898729701"
    }
    person.displayInfo()

    val friend = Person()
    friend.contactNumber = "72898729701"
    friend.name = "Clara"
    friend.displayInfo()

    Person().run {
        name = "Clara"
        contactNumber = "72898729701"
        return@run displayInfo()
    }

    string.run {
        println("lenght: $length")
    }

    with(Person()) {
        this?.name = "Clara"
        contactNumber = "72898729701"
        return@with displayInfo()
    }

}