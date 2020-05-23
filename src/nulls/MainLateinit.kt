package nulls

fun main() {
    val book1 = Book()
    book1.title = "Title"
    println(book1.title)

    book1.printInto()

}

class Book {
    lateinit var title: String

    fun printInto() {
        println("The title of the book is $title")
    }
}