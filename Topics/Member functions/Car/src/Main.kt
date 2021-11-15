const val SPEED: Int = 5
class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
    fun accelerate() {
        speed += SPEED
    }

    fun decelerate() {
        speed -= if (speed > 0) SPEED else 0
    }
}