package com.muklasr.designpattern.factory_method.examples.logistic.land

import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class Truck : Transport {
    override fun deliver() {
        println("Truck deliver the logistics")
    }
}