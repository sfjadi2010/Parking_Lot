const val LOWERBOUND: Int = 18
const val UPPERBOUND: Int = 59
fun main() {
    // write your code here
    val testAge: Int = readLine()!!.toInt()

    println(testAge in LOWERBOUND..UPPERBOUND)
}