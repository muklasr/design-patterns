package com.muklasr.designpattern.observer.examples.event

import java.io.File

interface EventListener {
    fun update(eventType: String, file: File)
}