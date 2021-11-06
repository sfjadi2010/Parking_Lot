fun main() {
    // put your code here
    val num1: Int = readLine()!!.toInt()
    val num2: Int = readLine()!!.toInt()
    val num3: Int = readLine()!!.toInt()

    print(num1 in num2..num3 || num1 in num3..num2)
}