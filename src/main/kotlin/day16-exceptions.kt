// Day 16
//
// Read a string, S, and print its integer value; if cannot be converted to an integer, print Bad String.


fun main() {
    val s = readLine()!!.toString()
    try { println(s.toInt()) }
    catch(exception: NumberFormatException) { println("Bad String") }
}