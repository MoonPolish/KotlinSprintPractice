package org.example.lesson_17

class Folder(
    private val originalName: String,
    private val fileCount: Int,
    private val isSecret: Boolean,
) {

    val name: String
        get() = if (isSecret) "скрытая папка" else originalName

    val filesCount: Int
        get() = if (isSecret) 0 else fileCount
}

fun main() {
    val secretFolder = Folder("Важные документы", 10, true)

    println("Имя папки: ${secretFolder.name}")
    println("Количесво файлов: ${secretFolder.filesCount}")
}