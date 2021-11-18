package com.muklasr.designpattern.builder.examples.car.components

class GPSNavigator {

    private var route: String = ""

    constructor() {
        this.route = "Jalan Parangtritis, Bantul, Bantul, Yogyakarta, Indonesia"
    }

    constructor(manualRoute: String) {
        this.route = manualRoute
    }

    fun getRoute(): String = this.route

}
