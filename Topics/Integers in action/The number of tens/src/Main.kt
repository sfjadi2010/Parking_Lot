fun main() {
    // put your code here
    val input: Int = readLine()!!.toInt()

    if (input in 0..1_000_000) {
        if (input < 10) {
            println(0)
        } else {
            val output: Int = input % 100 / 10
            println(output)
        }
    }
}