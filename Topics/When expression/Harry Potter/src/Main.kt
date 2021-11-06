fun main() {
    // write your code here
    val house: String = readLine()!!

    val output = when (house) {
        "gryffindor" -> "bravery"
        "hufflepuff" -> "loyalty"
        "slytherin" -> "cunning"
        "ravenclaw" -> "intellect"
        else -> "not a valid house"
    }

    println(output)
}