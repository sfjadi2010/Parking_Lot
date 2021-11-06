fun main() {
    // put your code here
    val num01: Long = readLine()!!.toLong()
    val num02: Long = readLine()!!.toLong()
    var product: Long = 1
    if (num01 < num02) {
        for (item in num01 until num02) {
            product *= item
        }
        print(product)
    }
}