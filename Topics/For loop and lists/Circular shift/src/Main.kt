fun main() {
    // write your code here
    val totalNumbers: Int = readLine()!!.toInt()
    val itemsList = mutableListOf<Int>()

    repeat(totalNumbers) {
        itemsList.add(readLine()!!.toInt())
    }

    itemsList.add(0, itemsList[itemsList.lastIndex])
    itemsList.removeAt(itemsList.lastIndex)
    println(itemsList.joinToString(" "))
}