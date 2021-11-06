fun main() {
    // write your code here
    val numbers: Int = readLine()!!.toInt()
    var firstMax: Int = Int.MIN_VALUE
    var secondMax: Int = Int.MIN_VALUE

    if (numbers > 1) {
        repeat(numbers) {
            val number: Int = readLine()!!.toInt()
            if (number >= firstMax) {
                secondMax = firstMax
                firstMax = number
            }
            if (number in secondMax until firstMax) {
                secondMax = number
            }
        }
        println(firstMax * secondMax)
    } else {
        println(readLine()!!.toInt())
    }
}