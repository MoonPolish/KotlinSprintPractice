package org.example.lesson_11

fun main() {
    val user = User2(
        username = "username",
        password = "1234567890"
    )
    user.setBioFromConsole()
    user.changePassword()

    user.printInfo()
}

class User2(
    val username: String,
    var password: String,
    var bio: String? = null,
) {

    fun printInfo() {
        println("Имя пользователя: $username")
        println("bio: $bio")
    }

    fun setBioFromConsole() {
        println("Введите своё bio: $bio")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()

        if (currentPassword == password) {
            println("Текущий пароль корректный. Введите новый пароль:")
            val newPassword = readln()

            if (newPassword != null && newPassword.isNotEmpty()) {
                password = newPassword
                println("Пароль изменён.")
            } else {
                println("Новый пароль не может быть пустым.")
            }
        }
    }
}

