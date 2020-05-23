package conditionals

fun main() {

    val myMoney = 40

    /*when(myMoney) {
        in 0..5 -> { print("I can spend just a few bucks") }
        in 6..20 -> { print("I can buy a nice meal") }
        else -> { print("I am rich") }
    }*/

    val bol1 = true
    val bol2 = false

    println(bol1)
    println(bol1 && bol2)
    println(bol1 || bol2)
    println(!bol2)

    /*if (myMoney > 0 && myMoney <= 5)
        print("I can spend just a few bucks")
     else if (myMoney > 5 && myMoney <= 20)
        print("I can buy a nice meal")
     else if (myMoney > 20)
        print("I am rich")
    }*/


    /*if (myMoney in 1 until 5) { // myMoney >= 1 && myMoney < 5
        print("I can spend just a few bucks")
    } else if (myMoney in 6..20) {
        print("I can buy a nice meal")
    } else if (myMoney > 20) {
        print("I am rich")
    }*/

}