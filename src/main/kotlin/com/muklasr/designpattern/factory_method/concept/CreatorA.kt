package com.muklasr.designpattern.factory_method.concept

class CreatorA : Creator() {
    override fun createProduct(): Product {
        return ProductA()
    }
}