fun main() {
    // put your code here
    val limit: Int = readLine()!!.toInt()
    var number: Int = 1
    while (true) {
        val square: Int = number * number
        if (square > limit) {
            break
        }
        println(square)
        number++
    }
}