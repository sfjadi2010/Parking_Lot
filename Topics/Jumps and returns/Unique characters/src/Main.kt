fun main() {
    // put your code here
    val input = readLine()!!.toString()
    var counter = 0
    outer@ for (indx in 0..input.lastIndex) {
        for (jndx in 0..input.lastIndex) {
            if (input[indx] == input[jndx] && indx != jndx) continue@outer
        }
        counter++
    }
    println(counter)
}