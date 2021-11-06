fun main() {
    // write your code here
    val stringInput: String = readLine()!!.toString()
    val numInput: Int = readLine()!!.toInt()
    val nthCharacter: Char = stringInput[numInput - 1]

    println("Symbol # $numInput of the string \"$stringInput\" is \'$nthCharacter\'")
}