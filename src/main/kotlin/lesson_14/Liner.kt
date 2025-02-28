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