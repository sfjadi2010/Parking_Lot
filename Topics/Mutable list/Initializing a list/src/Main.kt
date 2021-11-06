const val ZERO: Int = 0
const val ONE: Int = 1
const val NINE: Int = 9
const val TEN: Int = 10
const val HUNDREDTH: Int = 99
const val ONE_HUNDRED: Int = 100

fun main() {
    val numbers = MutableList(ONE_HUNDRED) { ZERO }
    numbers[ZERO] = ONE
    numbers[NINE] = TEN
    numbers[HUNDREDTH] = ONE_HUNDRED

    // do not touch the lines below 
    println(numbers.joinToString())
}