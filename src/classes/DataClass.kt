package classes

data class Carr(var owner: String = "Marta", val model: String = "Ford", val year: Int = 2000)

data class Personn(var name: String)

fun main() {

    val number1 = 5
    val number2 = 5

    //println(number1 == number2)
    //println(number1 === number2)

    val first = Integer(10)
    val second = Integer(10)

    //println(first == second)
    //println(first === second)

    val per1 = Personn("Marco").name
    val per2 = Personn("Marco").name

    println(per1 == per2)
    println(per1 === per2)

    /*val p1 = Personn("Marco", 20)
    println(p1)
    /*val p2 = Personn("Marco", 20)
    println(p1 == p2)

    val pp1 = Personn("Marco", 20)
    val pp2 = pp1
    println(pp1 == pp2)*/

    val c1 = Carr("Marco", "Ford", 2012)
    println(c1)
    //val c2 = Carr("Marco", "Ford", 2012)
    //println(c1 == c2)

    val c3 = Carr(model = "Ferrari")
    println(c3)*/

}