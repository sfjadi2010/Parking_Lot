const val ONE: Int = 1
const val THREE: Int = 3
fun main() {
    // put your code here
    var input: Int = readLine()!!.toInt()
    var result = "$input "

    while (input != 1) {
        input = if (input % 2 == 0) input / 2 else input * THREE + ONE
        result += "$input "
    }

    print(result)
}