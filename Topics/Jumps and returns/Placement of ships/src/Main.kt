const val FIVE = 5
const val THREE = 3
const val ONE = 1

fun main() {
    // put your code here
    val input = MutableList(THREE) { readLine()!!.split(" ").map { it.toInt() } }

    val rows = getCells(setCells(input, 0))
    val columns = getCells(setCells(input, 1))

    println(rows.trim())
    println(columns.trim())
}

private fun setCells(input: MutableList<List<Int>>, xy: Int): MutableList<Int> {
    val list = mutableListOf<Int>()
    for (xItem in input) {
        list.add(xItem[xy])
    }
    return list
}

private fun getCells(cells: MutableList<Int>): String {
    var result = ""
    for (cell in ONE..FIVE) {
        if (cell in cells) continue

        result += "$cell "
    }
    return result
}