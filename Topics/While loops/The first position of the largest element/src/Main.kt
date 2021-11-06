import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val listInt = mutableListOf<Int>()

    while (scanner.hasNextInt()) {
        val number = scanner.next().toInt()
        listInt.add(number)
    }

    val maxNum = listInt.maxOrNull()
    val maxNumPosition = listInt.indexOf(maxNum) + 1

    println("$maxNum $maxNumPosition")
}