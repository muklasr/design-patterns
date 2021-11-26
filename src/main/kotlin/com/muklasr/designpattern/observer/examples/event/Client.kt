package com.muklasr.designpattern.observer.examples.event

fun main() {
    val editor = Editor()
    editor.eventManager.subscribe("open", LogOpenListener("/path/to/log/file.txt"))
    editor.eventManager.subscribe("save", EmailNotificationListener("admin@example.com"))

    try {
        editor.openFile("test.txt")
        editor.saveFile()
    } catch (e: Exception) {
        e.printStackTrace()
    }
}