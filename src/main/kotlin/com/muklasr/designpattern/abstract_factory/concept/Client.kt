package com.muklasr.designpattern.abstract_factory.concept

fun main() {

    val factory = Variant1Factory()

    val productA = factory.createProductA()
    val productB = factory.createProductB()

}