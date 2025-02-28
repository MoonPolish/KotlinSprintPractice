package org.example.lesson_14

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    passengerCapacity: Int = 50,
    val cargoCapacity: Int = 1000,
) : Liner(name, speed, passengerCapacity) {
    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъёмность: $cargoCapacity тонн.")
    }
}