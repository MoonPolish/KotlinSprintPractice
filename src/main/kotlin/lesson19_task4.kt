package org.example

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun equipAmmo(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк вооружён патронами цвета ${ammo.name} с силой удара ${ammo.damage}.")
    }
    fun shoot() {
        if (currentAmmo != null) {
            println("Выстрел. Нанесённый урон ${currentAmmo?.damage}")
        } else {
            println("Танк не заряжен! Выстрел невозможен.")
        }
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    println()

    tank.equipAmmo(Ammo.BLUE)
    tank.shoot()
    println()

    tank.equipAmmo(Ammo.GREEN)
    tank.shoot()
    println()

    tank.equipAmmo(Ammo.RED)
    tank.shoot()
    println()
}