package org.example.lesson_14

class IcebreakerShip(
    name: String = "Ледокол",
    speed: Int = 10,
    passengerCapacity: Int = 20,
    val isPricksTheIce: Boolean = true,
) : Liner(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Этот корабль может колоть лёд: $isPricksTheIce")
    }
}