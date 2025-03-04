package org.example.lesson_14

abstract class Message(
    val text: String,
    val author: String,
    val id: Int,
) {
    override fun toString(): String {
        return "$id | $author: $text"
    }
}

class RegularMessage(
    text: String,
    author: String,
    id: Int,
) : Message(
    text,
    author,
    id,
)

class ThreadMessage(
    text: String,
    author: String,
    id: Int,
    val parentMessageId: Int,
) : Message(
    text,
    author,
    id,
) {
    override fun toString(): String {
        return super.toString().plus(" (parent message ID: $parentMessageId)")
    }
}

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 0

    fun addMessage(
        text: String,
        author: String,
    ) {
        val newMessage = RegularMessage(
            text,
            author,
            nextId++,
        )
        messages.add(newMessage)
    }
    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int,
    ) {
        if (messages.any { it.id == parentMessageId}) {
            val newMessage = ThreadMessage(
                text,
                author,
                nextId++,
                parentMessageId,
            )
            messages.add(newMessage)
        } else {
            throw IllegalArgumentException("Parent message with ID $parentMessageId not found.")
        }
    }
    fun printChat() {
        val groupedMessages = messages.groupBy {
            it
            when (it) {
                is ThreadMessage -> it.parentMessageId
                else -> it.id
            }
        }
        groupedMessages.forEach { (key, value) ->
            value.forEachIndexed { index, message ->
                if (index == 0) {
                    println(message)
                } else {
                    println("\t$message")
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Привет! Как дела?", "DobriyBrobovik",)
    chat.addMessage("Норм", "Cassandra",)
    chat.addThreadMessage("lol kek cheburek", "Mr. Kek", 1)
    chat.addThreadMessage("lol kek chebupel", "Mr. Chebupel", 1)

    chat.printChat()
}