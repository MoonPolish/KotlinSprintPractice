package org.example.lesson_16

class Order(
    private val orderNumber: Int,
    var status: OrderStatus,
) {

    enum class OrderStatus {
        PENDING, PROCESSING, SHIPPED, DELIVERED
    }

    private fun setStatus(newStatus: OrderStatus) {
        this.status = newStatus
    }

    fun requestChangeStatus(newStatus: OrderStatus) {
        setStatus(newStatus)
    }

    override fun toString(): String {
        return "Заказ №$orderNumber: Статус = $status"
    }
}

fun main() {
    val order = Order(
        12234,
        Order.OrderStatus.PENDING
    )
    println(order)

    order.requestChangeStatus(Order.OrderStatus.PROCESSING)
    println(order)
}