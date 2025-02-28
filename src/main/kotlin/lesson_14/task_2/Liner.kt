package org.example.lesson_14.task_2

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 30,
    val passengerCapacity: Int = 100,
) {

    open fun load() {
        println("Способ погрузки для типа $name: выдвигает горизонтальный трап со шкафута.")
    }

    open fun displayInfo() {
        println("Корабль: $name")
        println("Скорость: $speed")
        println("Вместимость пассажиров: $passengerCapacity")
    }
}