package com.muklasr.designpattern.builder.examples.car.components

class Engine {
    private var volume: Double = 0.0
    private var mileage: Double = 0.0
    private var isStarted: Boolean = false

    constructor(volume: Double, mileage: Double) {
        this.volume = volume
        this.mileage = mileage
    }

    fun on() {
        isStarted = true
    }

    fun off() {
        isStarted = false
    }

    fun isStarted(): Boolean = this.isStarted

    fun go(mileage: Double) {
        if (isStarted) {
            this.mileage += mileage
        } else {
            println("Cannot go(), you must start engine first!")
        }
    }

    fun getVolume(): Double = this.volume

    fun getMileage(): Double = this.mileage
}
