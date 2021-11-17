package com.muklasr.designpattern.factory_method.concept

class CreatorB : Creator() {
    override fun createProduct(): Product {
        return ProductB()
    }
}