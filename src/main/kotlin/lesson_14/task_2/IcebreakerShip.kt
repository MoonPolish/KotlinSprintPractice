package org.example.lesson_14.task_2

class IcebreakerShip(
    name: String = "Ледокол",
    speed: Int = 10,
    passengerCapacity: Int = 20,
    val isPricksTheIce: Boolean = true,
) : Liner(name, speed, passengerCapacity) {

    override fun load() {
        println("Способ погрузки для типа $name: открывает ворота со стороны кормы.")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Этот корабль может колоть лёд: $isPricksTheIce")
    }
}