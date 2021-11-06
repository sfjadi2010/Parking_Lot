fun main() {
    // put your code here
    val input: String = readLine()!!

    println("${input.last()}${input.substring(1, input.lastIndex)}${input.first()}")
}