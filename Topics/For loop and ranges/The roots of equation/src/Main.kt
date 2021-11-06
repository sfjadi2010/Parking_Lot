import kotlin.math.pow

const val LOWERBOUND: Int = 0
const val UPPERBOUND: Int = 1000

fun main() {
    // put your code here
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()
    val d: Int = readLine()!!.toInt()

    for (num in LOWERBOUND..UPPERBOUND) {
        if (a * num.toDouble().pow(3) + b * num.toDouble().pow(2) + c * num.toDouble() + d == 0.0) {
            println(num)
        }
    }
}