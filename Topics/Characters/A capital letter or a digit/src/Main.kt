fun main() {
    // write your code here
    val input: Char = readLine()!!.first()

    println(input.isDigit() && input != '0' || input.isUpperCase())
}