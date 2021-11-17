package com.muklasr.designpattern.factory_method.examples.logistic.air

import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class Plane : Transport {
    override fun deliver() {
        println("Plane deliver the logistics")
    }
}