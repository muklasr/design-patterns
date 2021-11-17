package com.muklasr.designpattern.factory_method.examples.logistic

import com.muklasr.designpattern.factory_method.examples.logistic.land.LandLogistic
import com.muklasr.designpattern.factory_method.examples.logistic.land.LandTransportType

private lateinit var transport: Logistic

fun main() {
    configure()
    runOperation()
}

private fun configure() {
//    transport = SeaLogistic()
    transport = LandLogistic(LandTransportType.TRUCK_BOX)
//    transport = LandLogistic(LandTransportType.TRUCK)
//    transport = AirLogistic()
}

private fun runOperation() {
    transport.planDelivery()
}