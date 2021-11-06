import java.util.*

fun main() {
    // write your code here
    val digitString: String = readLine()!!.lowercase(Locale.getDefault())
    print(
        when (digitString) {
            "one" -> "1"
            "two" -> "2"
            "three" -> "3"
            "four" -> "4"
            "five" -> "5"
            "six" -> "6"
            "seven" -> "7"
            "eight" -> "8"
            else -> "9"
        }
    )
}