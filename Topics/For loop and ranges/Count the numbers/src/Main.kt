fun main() {
    // put your code here
    val lowerBound: Int = readLine()!!.toInt()
    val upperBound: Int = readLine()!!.toInt()
    val divider: Int = readLine()!!.toInt()
    var counter: Int = 0

    if (lowerBound < upperBound) {
        for (element in lowerBound..upperBound) {
            if (element % divider == 0) counter++
        }

        println(counter)
    }
}