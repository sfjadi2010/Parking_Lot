fun main() {
    // write your code here
    val times: Int = readLine()!!.toInt()
    var minimum: Int = Int.MAX_VALUE
    repeat(times) {
        val item: Int = readLine()!!.toInt()

        if (minimum > item) minimum = item
    }

    print(minimum)
}