fun main() {
    // write your code here
    val input = readLine()!!.split(" ")
    val operator = input[1]
    val num1: Long = input[0].toLong()
    val num2: Long = input[2].toLong()

    if (num2 == 0L) {
        println("Division by 0!")
    } else {
        println(
            when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                "*" -> num1 * num2
                "/" -> num1 / num2
                else -> "Unknown operator"
            }
        )
    }
}