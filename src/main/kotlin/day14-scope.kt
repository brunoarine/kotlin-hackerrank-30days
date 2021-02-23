import java.util.*

class Difference(private val elements:IntArray) {
    var maximumDifference: Int = 0
    fun computeDifference() {
        maximumDifference = (elements.maxOrNull() ?: 0) - (elements.minOrNull() ?: 0)
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = sc.nextInt()
    }
    sc.close()
    val difference = Difference(a)
    difference.computeDifference()
    print(difference.maximumDifference)
}