package com.muklasr.designpattern.factory_method.examples.logistic.sea

import com.muklasr.designpattern.factory_method.examples.logistic.Logistic
import com.muklasr.designpattern.factory_method.examples.logistic.Transport

class SeaLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Ship()
    }
}