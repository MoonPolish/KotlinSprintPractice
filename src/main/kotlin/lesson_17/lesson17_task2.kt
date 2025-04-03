package org.example.lesson_17

class Ship(
    val name: String,
    var averageSpeed: Double,
    val portOfRegistry: String,
) {

    fun changeAverageSpeed(newSpeed: Double) {
        this.averageSpeed = newSpeed
    }

    fun tryToChangeName(newName: String): Boolean {
        println("Изменение имени корабля невозможно!")
        return false
    }
}

fun main() {

    val ship = Ship("Titanic", 22.5, "Southampton")

    println("Название корабля: ${ship.name}")
    println("Средняя скорость: ${ship.averageSpeed}")
    println("Порт приписки: ${ship.portOfRegistry}")

    if (!ship.tryToChangeName("New Name")) {
        println("Не удалось изменить имя.")
    }

    ship.changeAverageSpeed(25.20)
    println("Новая средняя скорость: ${ship.averageSpeed}")
}