package com.muklasr.designpattern.builder.examples.car.builders

import com.muklasr.designpattern.builder.examples.car.cars.CarType
import com.muklasr.designpattern.builder.examples.car.cars.Manual
import com.muklasr.designpattern.builder.examples.car.components.Engine
import com.muklasr.designpattern.builder.examples.car.components.GPSNavigator
import com.muklasr.designpattern.builder.examples.car.components.Transmission
import com.muklasr.designpattern.builder.examples.car.components.TripComputer

class CarManualBuilder : Builder {

    private lateinit var type: CarType
    private var seats: Int = 0
    private lateinit var engine: Engine
    private lateinit var transmission: Transmission
    private var tripComputer: TripComputer? = null
    private var gpsNavigator: GPSNavigator? = null

    override fun setCarType(type: CarType) {
        this.type = type
    }

    override fun setSeats(seats: Int) {
        this.seats = seats
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun setTripComputer(tripComputer: TripComputer) {
        this.tripComputer = tripComputer
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator) {
        this.gpsNavigator = gpsNavigator
    }

    fun build(): Manual = Manual(
        type = type,
        seats = seats,
        engine = engine,
        transmission = transmission,
        tripComputer = tripComputer,
        gpsNavigator = gpsNavigator,
    )
}