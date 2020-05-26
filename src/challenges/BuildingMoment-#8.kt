package challenges

class Robot {
    private var name: String? = null
    var list: List<Robot>? = null

    fun boot() : String {
        return if (name == null) {
            name = getName()
            name!!
        } else
            name!!
    }

    fun factoryReset() : String {
        return getName()
    }

    private fun getName() : String {
        val currentName = generateName()
        list?.forEach {
            if (it.name == currentName) {
                getName()
            }
        }
        return currentName
    }

    private fun generateName() : String {
         return "${getRandomString(2)}${(100..999).random()}"
    }

    private fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}

fun main() {
    val robot1 = Robot()
    val robot2 = Robot()
    val robot3 = Robot()

    val list = mutableListOf(robot1, robot2, robot3)

    robot1.list = list
    robot2.list = list
    robot3.list = list

    println(robot1.boot())
    println(robot2.boot())
    println(robot3.boot())

    println(robot1.boot()) // same name of before
    println(robot2.factoryReset()) //different name since there is a factory reset

}