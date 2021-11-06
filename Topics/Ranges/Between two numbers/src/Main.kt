fun main() {
    // write your code here
    val testNum: Int = readLine()!!.toInt()
    val lowerRange1: Int = readLine()!!.toInt()
    val upperRange1: Int = readLine()!!.toInt()

    if (lowerRange1 < upperRange1) {
        println(testNum in lowerRange1..upperRange1)
    } else {
        println(false)
    }
}