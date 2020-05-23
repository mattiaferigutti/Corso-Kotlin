package classes

enum class BandMember(val instrument: String) {
    MARCO("Guitar") {
        override fun typeOfMusic() = "rock"
    },
    GIANNI("Bass") {
        override fun typeOfMusic() = "metal"
    },
    LAURA("Voice") {
        override fun typeOfMusic() = "classic"
    };

    open fun typeOfMusic() = "pop"
}

sealed class Message
class ErrorMessage(var msg: String, var e: Exception) : Message()

fun main() {
    println(BandMember.LAURA.typeOfMusic())
}