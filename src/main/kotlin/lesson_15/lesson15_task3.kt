package org.example.lesson_15

abstract class User(
    val username: String,
    var active: Boolean = true,
) {
    abstract fun readForum(): String
    abstract fun writeMessage(message: String): String
}

class RegularUser(username: String) : User(username) {
    override fun readForum(): String {
        return "$username читает форум."
    }

    override fun writeMessage(message: String): String {
        return "$username пишет сообщение: '$message'"
    }
}

class Administrator(username: String) : User(username) {
    override fun readForum(): String {
        return "$username читает форум."
    }

    override fun writeMessage(message: String): String {
        return "$username пишет сообщение: '$message'"
    }

    fun deleteMessage(messageId: Int): String {
        return "$username удаляет сообщение с ID $messageId"
    }

    fun banUser(userToBan: User): String {
        userToBan.active = false
        return "$username блокирует пользователя ${userToBan.username}"
    }
}

fun main() {
    val regularUser = RegularUser("Rema")
    val administrator = Administrator("Admin")

    println(regularUser.readForum())
    println(regularUser.writeMessage("Привет всем!"))

    println(administrator.readForum())
    println(administrator.writeMessage("Уважаемые участники, пожалуйста, соблюдайте правила форума."))
    println(administrator.deleteMessage(123))
    println(administrator.banUser(regularUser))
}
