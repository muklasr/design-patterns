package com.muklasr.designpattern.builder.examples.car.director

import com.muklasr.designpattern.builder.examples.car.builders.Builder
import com.muklasr.designpattern.builder.examples.car.cars.CarType
import com.muklasr.designpattern.builder.examples.car.components.Engine
import com.muklasr.designpattern.builder.examples.car.components.GPSNavigator
import com.muklasr.designpattern.builder.examples.car.components.Transmission
import com.muklasr.designpattern.builder.examples.car.components.TripComputer

class Director {

    fun constructSportsCar(builder: Builder){
        builder.setCarType(CarType.SPORTS_CAR)
        builder.setSeats(2)
        builder.setEngine(Engine(volume = 3.0, mileage = 0.0))
        builder.setTransmission(Transmission.SEMI_AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPSNavigator(GPSNavigator())
    }

    fun constructCityCar(builder: Builder){
        builder.setCarType(CarType.CITY_CAR)
        builder.setSeats(2)
        builder.setEngine(Engine(volume = 1.2, mileage = 0.0))
        builder.setTransmission(Transmission.AUTOMATIC)
        builder.setTripComputer(TripComputer())
        builder.setGPSNavigator(GPSNavigator())
    }

    fun constructSUV(builder: Builder){
        builder.setCarType(CarType.SUV)
        builder.setSeats(4)
        builder.setEngine(Engine(volume = 2.5, mileage = 0.0))
        builder.setTransmission(Transmission.MANUAL)
        builder.setGPSNavigator(GPSNavigator())
    }
}