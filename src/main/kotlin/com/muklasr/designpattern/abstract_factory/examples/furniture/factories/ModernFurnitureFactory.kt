package com.muklasr.designpattern.abstract_factory.examples.furniture.factories

import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.ModernCoffeeTable
import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.*

class ModernFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ModernCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}