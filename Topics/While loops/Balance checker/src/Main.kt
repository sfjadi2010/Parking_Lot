fun main() {
    // write your code here
    var opening: Int = readLine()!!.toInt()
    val purchases = readLine()!!.split(" ").map { it.toInt() }.listIterator()
    var amount: Int = 0
    var sufficient = true

    while (purchases.hasNext() && sufficient) {
        amount = purchases.next()

        if (opening >= amount) {
            opening -= amount
        } else {
            sufficient = false
        }
    }

    if (sufficient) {
        println("Thank you for choosing us to manage your account! Your balance is $opening.")
    } else {
        println("Error, insufficient funds for the purchase. Your balance is $opening, but you need $amount.")
    }
}