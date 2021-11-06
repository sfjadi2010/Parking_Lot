fun main() {
    // write your code here
    val peanutButterCups: Int = readLine()!!.toInt()
    val isWeekend: Boolean = readLine()!!.toBoolean()

    println(!isWeekend && peanutButterCups in 10..20 || isWeekend && peanutButterCups in 15..25)
}