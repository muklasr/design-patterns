package com.muklasr.designpattern.factory_method.examples.logistic.land

import com.muklasr.designpattern.factory_method.examples.logistic.Logistic
import com.muklasr.designpattern.factory_method.examples.logistic.Transport
import com.muklasr.designpattern.factory_method.examples.logistic.land.LandTransportType.TRUCK
import com.muklasr.designpattern.factory_method.examples.logistic.land.LandTransportType.TRUCK_BOX

class LandLogistic(
    private val transportType: LandTransportType
) : Logistic() {

    override fun createTransport(): Transport {
        return when (transportType) {
            TRUCK -> Truck()
            TRUCK_BOX -> TruckBox()
        }
    }
}