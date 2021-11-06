fun main() {
    // write your code here
    val input: Int = readLine()!!.toInt()

    if (input > 0) {
        println("positive")
    } else if (input < 0) {
        println("negative")
    } else {
        println("zero")
    }
}