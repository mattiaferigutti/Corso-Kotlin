package challenges

import java.time.Year

fun main() {

    val birthYear = 1999 //insert your birth date
    val currentYear = Year.now().value // current year

    println(currentYear - birthYear)

}