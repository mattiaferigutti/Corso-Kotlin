package lambdas

fun main() {
    val numberOfLetters = "Mississippi".count()
    println(numberOfLetters)


    val numberOfLettersLam = "Mississippi".count { it == 's' }
    println(numberOfLettersLam)
}