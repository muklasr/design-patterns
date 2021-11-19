package com.muklasr.designpattern.abstract_factory.concept

class Variant2Factory : AbstractFactory {
    override fun createProductA(): ProductA {
        return ProductA2()
    }

    override fun createProductB(): ProductB {
        return ProductB2()
    }
}