// Day 11: given a 6x6 2D-array A, calculate the hourglass sum for every hourglass in it,
// then print the maximum hourglass sum.

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    // No need to import math packages just for that
    fun sumArray(array: List<Int>): Int{
        var sum = 0
        for(number in array){
            sum += number
        }
        return sum
    }

    val m = arr.size
    val n = arr[0].size
    var biggestHourglass = -70  // smaller than the smallest possible sum
    var hourglass: Int
    // skips all the computation if the matrix is too small for even one hourglass
    if (m >= 3 && n >= 3) {
        for (i in 0..m-3) {
            for (j in 0..n-3) {
                hourglass = sumArray(arr[i].slice(j..j+2)) + arr[i+1][j+1] + sumArray(arr[i+2].slice(j..j+2))
                if (hourglass > biggestHourglass) biggestHourglass = hourglass
            }
        }
    }
    println(biggestHourglass)
}
