fun main() {
    // put your code here
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    var result: Int = 0

    if (a < b) {
        for (element in a..b) {
            result += element
        }

        println(result)
    }
}