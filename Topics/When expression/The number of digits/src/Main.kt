const val FOUR_FIGURE = 4
const val THREE_FIGURE = 3
const val TWO_FIGURE = 2
val FOUR_FIGURE_RANGE = 1000..9999
val THREE_FIGURE_RANGE = 100..999
val TWO_FIGURE_RANGE = 10..99

fun main() {
    // put your code here
    val input: Int = readLine()!!.toInt()

    println(
        when (input) {
            in FOUR_FIGURE_RANGE -> FOUR_FIGURE
            in THREE_FIGURE_RANGE -> THREE_FIGURE
            in TWO_FIGURE_RANGE -> TWO_FIGURE
            else -> 1
        }
    )
}