const val PERCENT = 100
fun main() {
    // write your code here
    val gccontent = readLine()!!.toString().toLowerCase().toCharArray()
    val gCounts = gccontent.count { it.equals('g') }.toDouble()
    val cCounts = gccontent.count { it.equals('c') }.toDouble()
    val ratio: Double = (gCounts + cCounts) * PERCENT / gccontent.count()
    println(ratio)
}