package challenges

fun main() {

    val names = listOf("Marco Rossi", "Alfredo Andrei", "John Mayer", "Justin Biber")

    val usernames = mutableListOf<String>()

    for (name in names)
        usernames.add(name.replace(" ", "_").toLowerCase())

    for (username in usernames)
        println(username)

}