fun main() {
    // put your code here
    val input = readLine()!!

    for (i in input) {
        if (i.isDigit()) {
            println(i)
            break
        }
    }
}