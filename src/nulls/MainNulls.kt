package nulls

fun main() {

    var name: String? = null
    name = "Marco"

    name?.let {
        println("name: $it")
        println("name lenght is ${it.length}")
        println("name: $it Rossi")
    }


    /*var check: Int = if (name != null) {
        name.length
    } else {
        -1
    }

    var check2: Int = name?.length ?: -1

    println(check2)*/
}