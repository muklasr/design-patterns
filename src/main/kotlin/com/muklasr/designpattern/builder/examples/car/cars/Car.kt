package com.muklasr.designpattern.builder.examples.car.cars

import com.muklasr.designpattern.builder.examples.car.components.Engine
import com.muklasr.designpattern.builder.examples.car.components.GPSNavigator
import com.muklasr.designpattern.builder.examples.car.components.Transmission
import com.muklasr.designpattern.builder.examples.car.components.TripComputer

data class Car(
    val type: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val tripComputer: TripComputer?,
    val gpsNavigator: GPSNavigator?,
    var fuel: Double = 0.0
)
