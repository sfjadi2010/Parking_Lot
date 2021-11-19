// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    // implement your code here
    val inputs = MutableList(4) { readLine()!!.toInt() }
    val box1 = Box(inputs[0], inputs[1], inputs[3])
    val box2 = box1.copy(length = inputs[2])

    println(box1)
    println(box2)
}