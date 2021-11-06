package parking

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
            else -> {
                break
            }
        }
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
