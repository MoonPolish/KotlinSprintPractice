package org.example.lesson_18

class Order(val orderNumber: Long) {

    fun displayOrder(item: String) {
        println("Заказан товар: $item")
    }

    fun displayOrder(items: List<String>) {
        println("Заказаны следующие товары: ${items.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(156498)
    order1.displayOrder("computer")

    val order2 = Order(294832)
    order2.displayOrder(listOf("mouse", "phone"))
}