const val SINGLECHARACTER = 1

fun isPalindrome(word: String): String {
    if (word.length <= SINGLECHARACTER) return "yes"
    if (word.first() != word.last()) return "no"
    return isPalindrome(word.substring(1 until word.lastIndex))
}

fun main() {
    // write your code here
    println(isPalindrome(readLine()!!.toString()))
}