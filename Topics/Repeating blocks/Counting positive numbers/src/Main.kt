fun main() {
    // put your code here
    val n: Int = readLine()!!.toInt()
    var p: Int = 0

    repeat(n) {
        val input: Int = readLine()!!.toInt()

        if (input > 0) {
            p += 1
        }
    }

    println(p)
}