fun main() {
    // put your code here
    val num1: Int = readLine()!!.toInt()
    val num2: Int = readLine()!!.toInt()
    val num3: Int = readLine()!!.toInt()

    println(num1 > 0 && num2 <= 0 && num3 <= 0 ||
            num1 <= 0 && num2 > 0 && num3 <= 0 ||
            num1 <= 0 && num2 <= 0 && num3 > 0)
}