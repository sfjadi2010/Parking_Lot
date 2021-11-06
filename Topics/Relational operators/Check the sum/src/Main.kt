fun main() {
    // put your code here
    val num1: Int = readLine()!!.toInt()
    val num2: Int = readLine()!!.toInt()
    val num3: Int = readLine()!!.toInt()

    if (num1 + num2 == 20 || num1 + num3 == 20 || num2 + num3 == 20) {
        println(true)
    } else {
        println(false)
    }
}