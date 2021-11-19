data class Client(val name: String, val age: Int, val balance: Int)

fun main() {
    //implement your code here
    val clients = MutableList<Client>(2) { Client(readLine()!!.toString(), readLine()!!.toInt(), readLine()!!.toInt()) }

    println(clients[0].name == clients[1].name && clients[0].age == clients[1].age)
}