import java.util.*

// Day 12: Inheritance
//
// Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video.
// You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
// Completed code for Person and a declaration for Student are provided for you in the editor.
// Observe that Student inherits all the properties of Person.
// Complete the Student class by writing the following:
//  - A Student class constructor which has 4 parameters: firstName (String), lastName(String), idNumber(Int), scores(Array<Int>)
//  - A char calculate() method that calculates a Student object's average and returns the grade character representative
//    of their calculated age (see table on Hackerrank's challenge page)

open class Person (var firstName: String, var lastName: String, var idNumber: Int) {
    // Print person data
    fun printPerson() {
        println(
            """
                Name: $lastName, $firstName
                ID: $idNumber
                """.trimIndent()
        )
    }
}

class Student(firstName: String,
              lastName: String,
              idNumber: Int,
              val testScores: IntArray): Person(firstName, lastName, idNumber) {
    fun calculate() {
        when (testScores.average()) {
            in 90.0..100.0  -> "O"
            in 80.0..89.0   -> "E"
            in 70.0..79.0   -> "A"
            in 55.0..69.0   -> "P"
            in 40.0..54.0   -> "D"
            else            -> "T"
        }
    }
}

internal object Solution {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val firstName = scan.next()
        val lastName = scan.next()
        val id = scan.nextInt()
        val numScores = scan.nextInt()
        val testScores = IntArray(numScores)
        for (i in 0 until numScores) {
            testScores[i] = scan.nextInt()
        }
        scan.close()
        val s = Student(firstName, lastName, id, testScores)
        s.printPerson()
        System.out.println("Grade: " + s.calculate())
    }
}