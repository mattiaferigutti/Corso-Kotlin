package classes

class Person2(var name: String, age_param: Int, var height: Int) {

    var age = age_param
    set(value) {
        if (value > 0)
            field = value
        else
            println("Something went wrong")
    }

    get() {
        return field +20
    }

    init {
        if (age_param <= 0)
            println("Something went wrong")
    }

    fun printData() {
        println("name : $name, age : $age, height : $height")
    }
}

fun main() {
    val myFriend = Person2("Marco", 20, 180)
    myFriend.age = 20
    println(myFriend.age)
    //myFriend.printData()

    val myGirlfriend = Person2("Anna", 40, 160)
    //myGirlfriend.printData()
}