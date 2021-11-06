fun main() {
    // put your code here
    var counter: Int = 0

    do {
        val number: Int = readLine()!!.toInt()

        if (number > 0) {
            counter++
        }
    } while (number >= 1)

    println(counter)
}