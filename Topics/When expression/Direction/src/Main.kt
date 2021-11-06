const val UP: Int = 1
const val DOWN: Int = 2
const val LEFT: Int = 3
const val RIGHT: Int = 4
const val STAY: Int = 0
const val MOVE = "move"

fun main() {
    // write your code here
    val direction: Int = readLine()!!.toInt()
    println(
        when (direction) {
            UP -> "$MOVE up"
            DOWN -> "$MOVE down"
            LEFT -> "$MOVE left"
            RIGHT -> "$MOVE right"
            STAY -> "do not $MOVE"
            else -> "error!"
        }
    )
}