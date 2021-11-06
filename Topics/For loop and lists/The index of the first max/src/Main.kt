fun main() {
    // write your code here
    val totalNumbers: Int = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    for (index in 1..totalNumbers) {
        numbers.add(readLine()!!.toInt())
    }

    println(numbers.indexOfFirst { it == numbers.maxOrNull()!! })

}