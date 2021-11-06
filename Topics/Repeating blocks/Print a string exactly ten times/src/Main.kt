const val TIMES: Int = 10
fun main() {
    // put your code here
    val input: String = readLine()!!.toString()

    repeat(TIMES) {
        println(input)
    }
}