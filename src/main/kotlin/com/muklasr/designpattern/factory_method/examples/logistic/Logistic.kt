package com.muklasr.designpattern.factory_method.examples.logistic

abstract class Logistic {
    fun planDelivery() {
        val transport = createTransport()
        transport.deliver()
    }

    abstract fun createTransport(): Transport
}