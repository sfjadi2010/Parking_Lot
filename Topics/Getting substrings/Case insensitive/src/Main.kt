fun main() {
    // put your code here
    val line1: String = readLine()!!.toString()
    val line2: String = readLine()!!.toString()

    println(line1.equals(line2, ignoreCase = true))
}