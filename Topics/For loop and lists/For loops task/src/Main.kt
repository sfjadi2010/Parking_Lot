fun main() {
    // write your code here
    val listSize: Int = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    for (indx in 1..listSize) {
        numbers.add(readLine()!!.toInt())
    }

    val pANDm = readLine()!!.split(' ').map { it.toInt() }.toMutableList()

    println(if (numbers.containsAll(pANDm)) "YES" else "NO")
}