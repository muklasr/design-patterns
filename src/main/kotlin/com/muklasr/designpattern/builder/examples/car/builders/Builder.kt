package com.muklasr.designpattern.builder.examples.car.builders

import com.muklasr.designpattern.builder.examples.car.cars.CarType
import com.muklasr.designpattern.builder.examples.car.components.Engine
import com.muklasr.designpattern.builder.examples.car.components.GPSNavigator
import com.muklasr.designpattern.builder.examples.car.components.Transmission
import com.muklasr.designpattern.builder.examples.car.components.TripComputer

interface Builder {
    fun setCarType(type: CarType)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine)
    fun setTransmission(transmission: Transmission)
    fun setTripComputer(tripComputer: TripComputer)
    fun setGPSNavigator(gpsNavigator: GPSNavigator)
}