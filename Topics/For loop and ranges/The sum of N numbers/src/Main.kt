fun main() {
    // write your code here
    val n: Int = readLine()!!.toInt()
    var result: Int = 0
    repeat(n) {
        val num: Int = readLine()!!.toInt()
        result += num
    }

    println(result)
}