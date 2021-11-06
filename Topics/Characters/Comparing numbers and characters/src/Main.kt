fun main() {
    // write your code here
    val numberInput: Int = readLine()!!.toInt()
    val characterInput: Char = readLine()!!.toString().first()

    println(numberInput == characterInput.toInt())
}