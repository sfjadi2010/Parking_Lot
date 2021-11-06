const val THREE_DIVIDER: Int = 3
const val FIVE_DIVIDER: Int = 5

fun main() {
    // write your code here
    val lowerBound: Int = readLine()!!.toInt()
    val upperBound: Int = readLine()!!.toInt()

    for (element in lowerBound..upperBound) {
        if (element % THREE_DIVIDER == 0) print("Fizz")
        if (element % FIVE_DIVIDER == 0) print("Buzz")
        if (element % THREE_DIVIDER != 0 && element % FIVE_DIVIDER != 0) print(element)
        println()
    }
}