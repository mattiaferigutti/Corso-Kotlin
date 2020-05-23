package challenges

class Account (private val pin: Int = 46789, private var balance: Int) {
    fun deposit(amount: Int) {
        balance += amount
    }

    fun withdraw(amount: Int, pin: Int) {
        when {
            balance < amount -> {
                println("Insufficient funds in the account")
            }
            pin != this.pin -> {
                println("Pin is incorrect")
            }
            else -> balance -= amount
        }
    }

    fun check() : Int {
        return balance
    }
}

fun main() {
    val myAccount = Account(balance = 2500)

    myAccount.deposit(500)

    myAccount.withdraw(2000, 46789)

    println(myAccount.check())
}