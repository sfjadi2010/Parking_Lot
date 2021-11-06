fun main() {
    // write your code here
    val number: String = readLine()!!
    val length = number.length

    if (length % 2 == 0) {
        val left: Int = number.substring(0, length / 2).map { it.toString().toIntOrNull() }.sumOf { it!!.toInt() }
        val right: Int = number.substring(length / 2, length).map { it.toString().toIntOrNull() }.sumOf { it!!.toInt() }
        println(if (left == right) "YES" else "NO")
    } else {
        println("NO")
    }
}
