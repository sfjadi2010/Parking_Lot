fun main() {
    // put your code here
    var sum: Int = 0
    do {
        val entry = readLine()!!.toInt()
        sum += entry
    } while (entry > 0)
    println(sum)
}