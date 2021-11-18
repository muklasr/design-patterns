package com.muklasr.designpattern.builder.examples.car.components

import com.muklasr.designpattern.builder.examples.car.cars.Car

class TripComputer {

    private lateinit var car: Car

    fun setCar(car: Car){
        this.car = car
    }

    fun showFuel(){
        println("Fuel level: ${car.fuel}")
    }

    fun showStatus(){
        if(this.car.engine.isStarted()){
            println("Car is started")
        } else {
            println("Car isn't started")
        }
    }
}
