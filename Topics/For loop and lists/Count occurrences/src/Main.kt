fun main() {
    // write your code here
    val tNumber: Int = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    for (index in 1..tNumber) {
        numbers.add(readLine()!!.toInt())
    }
    val numFreq: Int = readLine()!!.toInt()

    var counter: Int = 0

    for (index in 0..numbers.lastIndex) {
        if (numFreq == numbers[index]) {
            counter++
        }
    }
    println(counter)
}