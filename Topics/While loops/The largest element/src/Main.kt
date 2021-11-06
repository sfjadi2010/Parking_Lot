fun main() {
    // put your code here
    var max: Int = 0

    do {
        val number: Int = readLine()!!.toInt()

        if (number > max) {
            max = number
        }
    } while (number >= 1)

    println(max)
}