package com.muklasr.designpattern.abstract_factory.examples.furniture.factories

import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.Chair
import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.CoffeeTable
import com.muklasr.designpattern.abstract_factory.examples.furniture.furnitures.Sofa

interface FurnitureFactory {
    fun createChair(): Chair
    fun createCoffeeTable(): CoffeeTable
    fun createSofa(): Sofa
}