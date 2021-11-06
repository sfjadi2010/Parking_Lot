fun main() {
    // write your code here
    val lowerRange1: Int = readLine()!!.toInt()
    val upperRange1: Int = readLine()!!.toInt()

    val lowerRange2: Int = readLine()!!.toInt()
    val upperRange2: Int = readLine()!!.toInt()

    val testNum: Int = readLine()!!.toInt()

    println(testNum in lowerRange1..upperRange1 && testNum in lowerRange2..upperRange2)
}