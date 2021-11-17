package com.muklasr.designpattern.factory_method.examples.logistic.land

import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class TruckBox : Transport {
    override fun deliver() {
        println("Truck Box deliver the logistics")
    }
}