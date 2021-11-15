import kotlin.math.roundToInt

const val HEADPHONES_TAX = 0.11
const val SMARTPHONE_TAX = 0.15
const val TV_TAX = 0.17
const val LAPTOP_TAX = 0.19

fun main() {
    val productType = readLine()!!
    val price = readLine()!!.toInt()
    val product = Product(price, productType)
    println(totalPrice(product))
}

class Product(val price: Int, val productType: String)

fun totalPrice(product: Product): Int {
    var price = 0
    price = when (product.productType) {
        "headphones" -> calculatePrice(product.price, HEADPHONES_TAX)
        "smartphone" -> calculatePrice(product.price, SMARTPHONE_TAX)
        "tv" -> calculatePrice(product.price, TV_TAX)
        else -> calculatePrice(product.price, LAPTOP_TAX)
    }
    return price
}

fun calculatePrice(price: Int, productTax: Double): Int {
    return (price + price * productTax).roundToInt()
}