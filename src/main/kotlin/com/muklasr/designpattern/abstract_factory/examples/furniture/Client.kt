package com.muklasr.designpattern.abstract_factory.examples.furniture

import com.muklasr.designpattern.abstract_factory.examples.furniture.factories.ModernFurnitureFactory
import com.muklasr.designpattern.abstract_factory.examples.furniture.factories.VictorianFurnitureFactory

fun main(){
    val modernFurnitureFactory= ModernFurnitureFactory()
    val modernChair = modernFurnitureFactory.createChair()
    val modernSofa = modernFurnitureFactory.createSofa()
    val modernCoffeeTable = modernFurnitureFactory.createCoffeeTable()

    val victorianFurnitureFactory= VictorianFurnitureFactory()
    val victorianChair = victorianFurnitureFactory.createChair()
    val victorianSofa = victorianFurnitureFactory.createSofa()
    val victorianCoffeeTable = victorianFurnitureFactory.createCoffeeTable()
}