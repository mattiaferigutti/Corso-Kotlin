package objects

class SomeClass private constructor(val string: String) {

    companion object {
        private var privateVar = 6

        fun justAssign(str: String) = SomeClass(str)

        @JvmStatic fun upperOrLowerCase(str: String, lowerCase: Boolean) : SomeClass {
            return if (lowerCase) {
                SomeClass(str.toUpperCase())
            } else {
                SomeClass(str.toLowerCase())
            }
        }
    }
}

fun main() {
    val class1 = SomeClass.justAssign("this is a string")
    val class2 = SomeClass.upperOrLowerCase("This Is A clAss", false)
    println(class1.string)
    println(class2.string)

    val class3 = SomeClass.justAssign("this is")
}