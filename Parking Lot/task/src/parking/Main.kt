package parking

import java.util.*

class Car(var registrationNumber: String, var color: String)
class ParkingSpot(var parkingSpot: Int, var car: Car? = null, var isSpotFree: Boolean = true)

fun main() {
    var parkingSpots: MutableList<ParkingSpot>? = null

    while (true) {
        val input = readLine()!!.split(" ")
        when {
            input[0] == "status" -> {
                status(parkingSpots)
            }
            input[0] == "create" -> {
                parkingSpots = create(parkingSpots, input)
            }
            input[0] == "park" -> {
                park(parkingSpots, input)
            }
            input[0] == "leave" -> {
                leave(parkingSpots, input)
            }
            input[0] == "reg_by_color" -> {
                regByColor(parkingSpots, input)
            }
            input[0] == "spot_by_color" -> {
                spotBy(parkingSpots, input, "color")
            }
            input[0] == "spot_by_reg" -> {
                spotBy(parkingSpots, input, "registration ")
            }
            else -> {
                break
            }
        }
    }
}

fun spotBy(parkingSpots: MutableList<ParkingSpot>?, input: List<String>, category: String) {
    if (parkingSpots != null) {
        if (category == "color") {
            val spots = parkingSpots.filter { it ->
                it.car?.color?.lowercase(Locale.getDefault()) == input[1].lowercase(Locale.getDefault()) }
            if (spots.isNotEmpty()) {
                val list = mutableListOf<Int>()
                for (spot in spots) {
                    spot.parkingSpot.let { list.add(it) }
                }
                println(list.joinToString())
            } else {
                println("No cars with color ${input[1]} were found.")
            }
        } else {
            val spots = parkingSpots.filter { it ->
                it.car?.registrationNumber?.lowercase(Locale.getDefault()) == input[1].lowercase(Locale.getDefault()) }
            if (spots.isNotEmpty()) {
                println(spots.first().parkingSpot)
            } else {
                println("No cars with registration number ${input[1]} were found.")
            }
        }
    } else {
        println("Sorry, a parking lot has not been created.")
    }
}

fun regByColor(parkingSpots: MutableList<ParkingSpot>?, input: List<String>) {
    if (parkingSpots != null) {
        val regs = parkingSpots.filter { it ->
            it.car?.color?.lowercase(Locale.getDefault()) == input[1].lowercase(Locale.getDefault()).trim()}
        if (regs.isNotEmpty()) {
            val regList = mutableListOf<String>()
            for(reg in regs) {
                reg.car?.registrationNumber?.let { regList.add(it) }
            }
            println(regList.joinToString())
        } else {
            println("No cars with color ${input[1]} were found.")
        }
    } else {
        println("Sorry, a parking lot has not been created.")
    }
}

private fun leave(
    parkingSpots: MutableList<ParkingSpot>?,
    input: List<String>
) {
    if (parkingSpots != null) {
        var parkedSpot = parkingSpots.singleOrNull() { it.parkingSpot == input[1].toInt() }
        parkedSpot?.car = null
        parkedSpot?.isSpotFree = true
        println("Spot ${input[1]} is free.")
    } else {
        println("Sorry, a parking lot has not been created.")
    }
}

private fun park(
    parkingSpots: MutableList<ParkingSpot>?,
    input: List<String>
) {
    if (parkingSpots != null) {
        val freeSlot = parkingSpots?.firstOrNull { it.isSpotFree }
        if (freeSlot == null) {
            println("Sorry, the parking lot is full.")
        } else {
            freeSlot.isSpotFree = false
            var parkedCar = Car(input[1], input[2])
            freeSlot.car = parkedCar
            println("${parkedCar?.color} car parked in spot ${freeSlot.parkingSpot}.")
        }
    } else {
        println("Sorry, a parking lot has not been created.")
    }
}

private fun create(
    parkingSpots: MutableList<ParkingSpot>?,
    input: List<String>
): MutableList<ParkingSpot>? {
    if (input[1] != "") {
        val createdSpots = MutableList(input[1].toInt()) { ParkingSpot(parkingSpot = it + 1) }
        if (createdSpots != null) {
            println("Created a parking lot with ${input[1]} spots.")
        }
        return createdSpots
    }
    return null
}

private fun status(parkingSpots: MutableList<ParkingSpot>?) {
    if (parkingSpots == null) {
        println("Sorry, a parking lot has not been created.")
    } else {
        val occupiedParkingSpot = parkingSpots?.filter { !it.isSpotFree }
        if (occupiedParkingSpot?.count()!! > 0) {
            for (parkingSpot in occupiedParkingSpot) {
                if (!parkingSpot.isSpotFree) {
                    println("${parkingSpot.parkingSpot} ${parkingSpot.car?.registrationNumber} ${parkingSpot.car?.color}")
                }
            }
        } else {
            println("Parking lot is empty.")
        }
    }
}
