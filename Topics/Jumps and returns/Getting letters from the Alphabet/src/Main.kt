fun main() {
    // put your code here
    val input = readLine()!!.toString()

    val alphabets = "abcdefghijklmnopqrstuvwxyz"

    for (character in alphabets) {
        if (character in input) {
            break
        }
        print(character)
    }
}