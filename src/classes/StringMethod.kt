package classes

class StringMethod(val id: String) {
    override fun toString(): String {
        return "id: $id + super " + super.toString()
    }
}

fun main() {
    val sm = StringMethod("first")
    println(sm)
}