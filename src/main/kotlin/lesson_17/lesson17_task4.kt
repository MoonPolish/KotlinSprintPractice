package org.example.lesson_17

class ThePackage(val packageNumber: Int) {
    var currentLocation: String = "Отправлено"
        set(value) {
            movementCounter++
            field = value
        }

    var movementCounter: Int = 0
}

fun main() {
    val thePackage = ThePackage(45612)

    thePackage.currentLocation = "Пункт выдачи 1"
    println("Текущее местоположение посылки: ${thePackage.currentLocation}. Количество перемещений: ${thePackage.movementCounter}")

    thePackage.currentLocation = "Пункт выдачи 2"
    println("Текущее местоположение посылки: ${thePackage.currentLocation}. Количество перемещений: ${thePackage.movementCounter}")

    thePackage.currentLocation = "Основной пункт выдачи"
    println("Текущее местоположение посылки: ${thePackage.currentLocation}. Количество перемещений: ${thePackage.movementCounter}")
}