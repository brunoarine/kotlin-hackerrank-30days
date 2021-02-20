import java.util.*

//Day 13
//
// Given a Book class and a Solution class, write a MyBook class that does the following:
//
//Inherits from Book
//Has a parameterized constructor taking these parameters: title(String), author(String), price(Int)
// Implements the Book class' abstract display() method so it prints these lines:
//
//"Name:" a space, and then the current instance's
//"Author:" a space, and then the current instance's
//"Price:" a space, and then the current instance's .
abstract class Book(var title: String, var author: String) {
    abstract fun display()
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable
///**
// * Class Constructor
// *
// * @param title The book's title.
// * @param author The book's author.
// * @param price The book's price.
// */
class MyBook(title: String, author: String, val price: Int): Book(title, author) {
// * Method Name: display
// *
// * Print the title, author, and price in the specified format.
// */
// Write your method here
// End class
    override fun display() {
        println("""
            Name: $title
            Author: $author
            Price: $price
        """.trimIndent())
    }
}

    fun main() {
        val scanner = Scanner(System.`in`)
        val title = scanner.nextLine()
        val author = scanner.nextLine()
        val price = scanner.nextInt()

        val book: Book = MyBook(title, author, price)
        book.display()
    }