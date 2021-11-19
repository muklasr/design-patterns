package com.muklasr.designpattern.abstract_factory.examples.furniture.factories

import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.*

class VictorianFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return VictorianCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}