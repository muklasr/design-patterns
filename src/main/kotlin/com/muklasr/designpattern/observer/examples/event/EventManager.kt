package com.muklasr.designpattern.observer.examples.event

import java.io.File


class EventManager {

    val listeners = HashMap<String, ArrayList<EventListener>>()

    constructor(vararg operations: String) {
        for (operation in operations) {
            listeners[operation] = ArrayList()
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.add(listener)
    }

    fun unsubscribe(eventType: String, listener: EventListener) {
        val users = listeners[eventType]
        users?.remove(listener)
    }

    fun notify(eventType: String, file: File) {
        val users = listeners[eventType]
        users?.forEach {
            it.update(eventType, file)
        }
    }
}