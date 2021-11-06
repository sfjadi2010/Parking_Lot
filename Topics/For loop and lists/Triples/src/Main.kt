fun main() {
    // write your code here
    val numbers = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    var counter: Int = 0
    for (index in 0 until numbers.lastIndex - 1) {
        if (numbers[index] + 1 == numbers[index + 1] && numbers[index + 1 ] + 1 == numbers[index + 2]) {
            counter++
        }
    }
    println(counter)
}