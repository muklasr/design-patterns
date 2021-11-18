package com.muklasr.designpattern.builder.examples.home

class HomeBuilder {

    private var windows: Int = 1
    private var doors: Int = 1
    private var rooms: Int = 1
    private var hasGarden: Boolean = false
    private var hasSwimmingPool: Boolean = false
    private var hasGarage: Boolean = false

    fun buildWindows(n: Int) {
        this.windows = n
    }

    fun buildDoors(n: Int) {
        this.doors = n
    }

    fun buildRooms(n: Int) {
        this.rooms = n
    }

    fun buildGarden() {
        this.hasGarden = true
    }

    fun buildSwimmingPool() {
        this.hasSwimmingPool = true
    }

    fun buildGarage() {
        this.hasGarage = true
    }

    fun buildHome(): Home = Home(
        windows = windows,
        doors = doors,
        rooms = rooms,
        hasGarden = hasGarden,
        hasSwimmingPool = hasSwimmingPool,
        hasGarage = hasGarage,
    )
}