package com.muklasr.designpattern.observer.examples.event

import java.io.File

class EmailNotificationListener : EventListener {
    private var email: String

    constructor(email: String) {
        this.email = email
    }

    override fun update(eventType: String, file: File) {
        println("Email to $email: Someone has performed $eventType operation with the following file: ${file.name}")
    }
}