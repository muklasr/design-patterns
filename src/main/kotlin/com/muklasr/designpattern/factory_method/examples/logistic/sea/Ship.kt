package com.muklasr.designpattern.factory_method.examples.logistic.sea

import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class Ship : Transport {
    override fun deliver() {
        println("Ship deliver the logistics")
    }
}