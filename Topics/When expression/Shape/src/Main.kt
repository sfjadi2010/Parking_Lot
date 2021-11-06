const val MESSAGE: String = "You have chosen a"
const val SQUARE: Int = 1
const val CIRCLE: Int = 2
const val TRIANGLE: Int = 3
const val RHOMBUS: Int = 4

fun main(args: Array<String>) {
    // write your code here
    val input: Int = readLine()!!.toInt()

    print(
        when (input) {
            SQUARE -> "$MESSAGE square"
            CIRCLE -> "$MESSAGE circle"
            TRIANGLE -> "$MESSAGE triangle"
            RHOMBUS -> "$MESSAGE rhombus"
            else -> "There is no such shape!"
        }
    )
}