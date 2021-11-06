fun main() {
    // write your code here
    val time: String = readLine()!!.toString().trim().replace(" ", ":")
    val date: String = readLine()!!.toString().trim().replace(" ", "/")

    println("$time $date")
}