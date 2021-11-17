package com.muklasr.designpattern.factory_method.concept

abstract class Creator {

    fun someOperation(){
        val product = createProduct()
        product.doStuff()
    }

    abstract fun createProduct(): Product
}