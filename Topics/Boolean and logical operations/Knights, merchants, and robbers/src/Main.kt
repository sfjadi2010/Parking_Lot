fun main() {    
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    // write your code here
    val secondAnswer = readLine().toBoolean()
    val confessionAnswer = readLine().toBoolean()

    if (firstAnswer xor secondAnswer || confessionAnswer) {
        println(false)
    } else {
        println(true)
    }
}