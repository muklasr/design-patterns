package com.muklasr.designpattern.observer.examples.event

import java.io.File

class Editor {
    lateinit var eventManager: EventManager
    var file: File? = null

    constructor() {
        this.eventManager = EventManager("open", "save")
    }

    fun openFile(filePath: String) {
        this.file = File(filePath)
        file?.let { file ->
            eventManager.notify("open", file)
        }
    }

    fun saveFile() {
        file?.let { file ->
            eventManager.notify("save", file)
        }
        if (file == null) throw Exception("Please open a file first.")
    }
}