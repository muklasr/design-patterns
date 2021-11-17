package com.muklasr.designpattern.factory_method.examples.logistic.air

import com.muklasr.designpattern.factory_method.examples.logistic.Logistic
import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class AirLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Plane()
    }
}