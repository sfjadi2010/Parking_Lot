import kotlin.math.pow

const val FIBONACCI_NUMBERS_MAX = 11
const val TRIANGLE_NUMBERS_MAX = 10
const val TEN_POWERS_MAX = 6
const val TEN_DOUBLE = 10.0

fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    print(
        when (input) {
            in List(FIBONACCI_NUMBERS_MAX) { index -> fibonacciNumber(index) } -> "F"
            in List(TRIANGLE_NUMBERS_MAX) { index -> triangleNumber(index) } -> "T"
            in List(TEN_POWERS_MAX) { index -> tenPower(index) } -> "P"
            else -> "N"
        }
    )
}

fun tenPower(n: Int) = TEN_DOUBLE.pow(n).toInt()

fun triangleNumber(n: Int) = n * (n + 1) / 2

fun fibonacciNumber(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
}