package classes

interface Roamable {
    fun roam()
}

class Car(val model: String) : Roamable {
    fun info() {
        println("The car's model is $model")
    }

    override fun roam() {
        println("My car is roaming")
    }
}

open class Animal(var food: String) : Roamable {
    open fun eat() {
        println("I'm eating $food")
    }

    override fun roam() {
        println("The animal is roaming")
    }
}

class Lion(var name: String, food: String) : Animal(food) {
    fun info() {
        println("My name is $name the King")
    }

    override fun eat() {
        super.eat()
    }

    override fun roam() {
        super.roam()
    }
}

class Hippo(var name: String, food: String) : Animal(food) {
    fun info() {
        println("My name is $name")
    }

    override fun eat() {
        super.eat()
    }

    override fun roam() {
        super.roam()
    }
}

fun main() {

    val roamables = arrayOf(
        Hippo("Samanta", "fish"),
        Lion("Alex", "meat"),
        Car("Ford")
    )

    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    val animal = Animal("food")
    val lion: Lion = animal as Lion 
}