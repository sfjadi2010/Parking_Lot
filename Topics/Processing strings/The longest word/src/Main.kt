fun main() {
    // write your code here
    val words = readLine()!!.split(" ")

//    var longest: String = ""
//
//    for (word in words) {
//        if (longest.length < word.length) {
//            longest = word
//        }
//    }

    println(words.maxByOrNull { it.length }!!)
}