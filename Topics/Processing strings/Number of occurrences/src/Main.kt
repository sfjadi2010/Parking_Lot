fun main() {
    // write your code here
    val input = MutableList(2) { readLine()!!}
    var counter: Int = 0
    var location = input.first().indexOf(input.last())

    for (indx in 0 until input.first().lastIndex) {
        if (input.first().indexOf(input.last(), location) > 0 ) {
            counter++
            location = input.first().indexOf(input.last())
        }
    }
    println(counter)
}