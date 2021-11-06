const val SEQUENCE_LIMIT: Int = 30000
const val ELEMENT_LIMIT: Int = 1000
const val DIVIDER: Int = 4

fun main() {
    // put your code here
    val sequence: Int = readLine()!!.toInt()
    var maxNum: Int = 0

    if (sequence <= SEQUENCE_LIMIT) {
        repeat(sequence) {
            val element: Int = readLine()!!.toInt()

            if (element <= ELEMENT_LIMIT && element % DIVIDER == 0 && element > maxNum) maxNum = element
        }
    }

    println(maxNum)
}