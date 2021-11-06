fun main() {
    // put your code here
    val num1: Int = readLine()!!.toInt()
    val num2: Int = readLine()!!.toInt()
    val num3: Int = readLine()!!.toInt()

    println(num1 >= num2 && num2 >= num3 || num1 <= num2 && num2 <= num3)
}