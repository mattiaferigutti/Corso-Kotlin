package collections

fun main() {

    val friendSet = mutableSetOf("Marco", "Giulia", "Giulia", "Gianni", "Gianni")

    //println(friendSet.contains("Marco"))

    friendSet.add("Alessandro")
    friendSet.add("Alessandro")
    friendSet.remove("Alessandro")

    println("list of friends")
    for (friend in friendSet) {
        println(friend)
    }

}