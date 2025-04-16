package org.example

enum class Category {
    CLOTHES {
        override fun getCategoryName(): String = "Одежда"
    },
    STATIONERY {
        override fun getCategoryName(): String = "Канцелярские товары"
    },
    SUNDRY {
        override fun getCategoryName(): String = "Разное"
    };

    abstract fun getCategoryName(): String
}

class Product(val name: String,
              val id: Int,
              val category: Category,
    ) {
    fun printInfo() {
        println("Название: $name")
        println("Идентификатор: $id")
        println("Категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHES)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Шприц", 3, Category.SUNDRY)

    println(product1.printInfo())
    println(product2.printInfo())
    println(product3.printInfo())
}