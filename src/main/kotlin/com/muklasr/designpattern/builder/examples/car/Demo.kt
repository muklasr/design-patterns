package com.muklasr.designpattern.builder.examples.car

import com.muklasr.designpattern.builder.examples.car.builders.CarBuilder
import com.muklasr.designpattern.builder.examples.car.builders.CarManualBuilder
import com.muklasr.designpattern.builder.examples.car.director.Director

fun main(){
    val director = Director()

    val carBuilder = CarBuilder()
    director.constructSUV(carBuilder)

    val car = carBuilder.build()
    println("Car built: \n${car.type}\n")

    val carManualBuilder = CarManualBuilder()
    director.constructSUV(carManualBuilder)
    val manual = carManualBuilder.build()
    println("Car manual built: \n${manual.getInfo()}")
}