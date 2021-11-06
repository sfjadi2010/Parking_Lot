fun main() {
    // put your code here
    var numbers: Int = readLine()!!.toInt()
    var item: Int = 1

    while (numbers >= 1) {
        for (number in 1..item) {
            print("$item ")
            numbers--
            if (numbers == 0) break
        }
        item++
    }
}