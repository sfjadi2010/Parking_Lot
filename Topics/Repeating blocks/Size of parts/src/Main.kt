fun main() {
    // put your code here
    val n: Int = readLine()!!.toInt()
    var s: Int = 0
    var l: Int = 0
    var p: Int = 0

    repeat(n) {
        val part: Int = readLine()!!.toInt()

        if (part == 1) {
            l += 1
        } else if (part == -1) {
            s += 1
        } else if (part == 0) {
            p += 1
        }
    }

    println("$p $l $s ")
}
