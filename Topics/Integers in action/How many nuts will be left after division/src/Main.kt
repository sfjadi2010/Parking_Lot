fun main() {
    // put your code here
    val n: Int = readLine()!!.toInt()
    val k: Int = readLine()!!.toInt()

    if (n <= 10_000 && k <= 10_000) {
        val result: Int = k % n
        println(result)
    }

}