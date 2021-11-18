fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

class House(val rooms: Int, val price: Int) {}

fun totalPrice(house: House): Int {
    val rooms = house.rooms
    val price = if (house.price < 0) 0 else if (house.price > 1_000_000) 1_000_000 else house.price
    return when {
        rooms <= 1 -> (1 * price).toInt()
        rooms in 2..3 -> (1.2 * price).toInt()
        rooms == 4 -> (1.25 * price).toInt()
        rooms in 5..7 -> (1.4 * price).toInt()
        rooms in 8..10 -> (1.6 * price).toInt()
        else -> (1.6 * price).toInt()
    }
}