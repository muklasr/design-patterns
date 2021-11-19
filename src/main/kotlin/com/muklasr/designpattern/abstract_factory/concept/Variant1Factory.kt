package com.muklasr.designpattern.abstract_factory.concept

class Variant1Factory : AbstractFactory {
    override fun createProductA(): ProductA {
        return ProductA1()
    }

    override fun createProductB(): ProductB {
        return ProductB1()
    }
}