package classes

/*interface Roamable {

    val velocity: Int

    fun roam()

    fun roamPrint() {
        println("I am roaming")
    }
}*/

interface A {
    fun myFunction() {
        println("from A")
    }
}

interface B {
    fun myFunction() {
        println("from B")
    }
}

class X : A, B {
    override fun myFunction() {
        super<A>.myFunction()
        super<B>.myFunction()

        // some code
    }
}

fun main() {
    val a = X()
    a.myFunction()
}