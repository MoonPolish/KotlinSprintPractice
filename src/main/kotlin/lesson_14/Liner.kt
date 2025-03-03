package org.example.lesson_14

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 30,
    val passengerCapacity: Int = 100,
) {
    open fun displayInfo() {
        println("Корабль: $name")
        println("Скорость: $speed")
        println("Вместимость пассажиров: $passengerCapacity")
    }
}

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

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val icebreaker = IcebreakerShip()

    println("Информация о кораблях:")
    liner.displayInfo()
    println()
    cargo.displayInfo()
    println()
    icebreaker.displayInfo()
}