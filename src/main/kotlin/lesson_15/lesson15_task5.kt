package org.example.lesson_15

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger(passengerCount: Int): Boolean
    fun unloadPassenger(passengerCount: Int): Boolean
}

interface CargoTransport {
    val maxCargoWeight: Double
    var currentCargoWeight: Double

    fun loadCargo(weight: Double): Boolean
    fun unloadCargo(weight: Double): Boolean
}

abstract class Vehicle(
    protected val model: String,
    protected val color: String,
) {
    abstract fun moveTo(destination: String)
}

class Truck(
    model: String,
    color: String,
) : Vehicle(model, color), PassengerTransport, CargoTransport {

    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0

    override val maxCargoWeight: Double = 2.0
    override var currentCargoWeight: Double = 0.0

    override fun loadPassenger(passengerCount: Int): Boolean {
        if (currentPassengers + passengerCount <= maxPassengers) {
            currentPassengers += passengerCount
            return true
        } else {
            println("Нельзя загрузить больше пассажиров, чем разрешено.")
            return false
        }
    }

    override fun unloadPassenger(passengerCount: Int): Boolean {
        if (currentPassengers >= passengerCount) {
            currentPassengers -= passengerCount
            return true
        } else {
            println("Нельзя выгрузить больше пассажиров, чем есть.")
            return false
        }
    }

    override fun loadCargo(weight: Double): Boolean {
        if (currentCargoWeight + weight <= maxCargoWeight) {
            currentCargoWeight += weight
            return true
        } else {
            println("Нельзя загрузить больше груза, чем разрешено.")
            return false
        }
    }

    override fun unloadCargo(weight: Double): Boolean {
        if (currentCargoWeight >= weight) {
            currentCargoWeight -= weight
            return true
        } else {
            println("Нельзя разгрузить больше груза, чем есть.")
            return false
        }
    }

    override fun moveTo(destination: String) {
        println("$model движется к пункту назначения: $destination")
    }
}

class Car(
    model: String,
    color: String,
) : Vehicle(model, color), PassengerTransport {

    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun loadPassenger(passengerCount: Int): Boolean {
        if (currentPassengers + passengerCount <= maxPassengers) {
            currentPassengers += passengerCount
            return true
        } else {
            println("Нельзя загрузить больше пассажиров, чем разрешено.")
            return false
        }
    }

    override fun unloadPassenger(passengerCount: Int): Boolean {
        if (currentPassengers >= passengerCount) {
            currentPassengers -= passengerCount
            return true
        } else {
            println("Нельзя выгрузить больше пассажиров, чем есть.")
            return false
        }
    }

    override fun moveTo(destination: String) {
        println("$model движется к пункту назначения: $destination")
    }
}

fun main() {
    val truck = Truck("Камаз", "Оранжевый")
    val car = Car("Вольво", "Серый")

    truck.loadCargo(2.0)
    println("Текущий вес груза в грузовике: ${truck.currentCargoWeight} тонн")

    car.loadPassenger(3)
    println("Количество пассажиров в машине: ${car.currentPassengers}")

    car.loadPassenger(1)

    car.unloadPassenger(1)
    println("Количество пассажиров в машине: ${car.currentPassengers}")

    truck.moveTo("Склад")
    car.moveTo("Дом")
}

