const val THREE = 3
fun main() {
    // write your code here
    val (left, right) = readLine()!!.chunked(THREE).map { it.map { it.toInt() }.sum() }
    println(if (left == right) "Lucky" else "Regular")
}