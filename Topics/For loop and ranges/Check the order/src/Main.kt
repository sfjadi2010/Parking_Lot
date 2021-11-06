fun main() {
    // write your code here
    val numbers: Int = readLine()!!.toInt()
    var min: Int = Int.MIN_VALUE
    var result: String = "YES"

    repeat(numbers) {
        val input: Int = readLine()!!.toInt()

        if (input < min) {
            result = "NO"
        }
        min = input
    }
    print(result)
}