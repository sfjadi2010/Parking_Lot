fun main() {
    // write your code here
    val word: String = readLine()!!.toString()
    val half: Int = word.length / 2

    if (word.length % 2 == 0) {
        print("${word.substring(0, half - 1)}${word.substring(half + 1, word.length)}")
    } else {
        print("${word.substring(0, half)}${word.substring(half + 1, word.length)}")
    }
}
