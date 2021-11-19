package com.muklasr.designpattern.abstract_factory.concept

interface AbstractFactory {
    fun createProductA(): ProductA
    fun createProductB(): ProductB
}