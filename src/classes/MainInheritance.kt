package classes

open class Person(var name: String, var age: Int) {

    open fun printData() {
        println("name: $name, age: $age")
    }

    open fun eat() {
        println("I'm eating...")
    }

    open fun sleep() {
        println("I'm sleeping...")
    }
}

class FootballPlayer(name: String, age: Int, var club: String) : Person(name, age) {

    fun playing() {
        println("I'm playing for the $club team")
    }
}

class Teacher(name: String, age: Int, var subject: String) : Person(name, age) {

    override fun eat() {
        super.eat()
        print("$name is eating")
    }

    fun teaching() {
        println("I'm teaching $subject")
    }
}

fun main() {
    val player = FootballPlayer("Gianmarco", 25, "Milan")
    player.playing()

    val teacher = Teacher("Anna", 46, "Math")
    teacher.teaching()
    teacher.eat()
}