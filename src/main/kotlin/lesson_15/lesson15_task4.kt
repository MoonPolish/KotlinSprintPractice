package org.example.lesson_15

interface Searchable {
    fun search(): String
}

interface HasAccessories {
    fun getAccessories(): List<Accessory>
}

open class Product(
    val name: String,
    var quantity: Int,
)

class Accessory(
    name: String,
    quantity: Int,
) : Product(name, quantity)

class Instrument(
    name: String,
    quantity: Int,
) : Product(name, quantity), HasAccessories, Searchable {
    override fun getAccessories(): List<Accessory> {
        return listOf(Accessory("Струна", 10))
    }

    override fun search(): String {
        return "Выполняется поиск..."
    }
}

fun main() {
    val guitar = Instrument("Гитара", 5)
    println(guitar.search())

    val accessories = guitar.getAccessories()
    for (accessory in accessories) {
        println("${accessory.name}: ${accessory.quantity}")
    }
}

