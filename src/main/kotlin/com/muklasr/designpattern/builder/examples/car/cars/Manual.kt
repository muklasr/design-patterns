package com.muklasr.designpattern.builder.examples.car.cars

import com.muklasr.designpattern.builder.examples.car.components.Engine
import com.muklasr.designpattern.builder.examples.car.components.GPSNavigator
import com.muklasr.designpattern.builder.examples.car.components.Transmission
import com.muklasr.designpattern.builder.examples.car.components.TripComputer

data class Manual(
    val type: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer?,
    val gpsNavigator: GPSNavigator?,
) {

    fun getInfo(): String {
        var info = ""
        info += """
        Type of car    : $type
        Count of seats : $seats
        Engine         : volume - ${engine.getVolume()}; mileage - ${engine.getMileage()}
        Transmission   : $transmission
        Trip Computer  : ${if(tripComputer != null) "Functional" else "N/A"}
        GPS Navigator  : ${if(gpsNavigator != null) "Functional" else "N/A"}
        """.trimIndent()

        return info
    }
}