package com.muklasr.designpattern.builder.concept

import com.muklasr.designpattern.builder.concept.builders.ProductABuilder
import com.muklasr.designpattern.builder.concept.builders.ProductBBuilder
import com.muklasr.designpattern.builder.concept.chain_builders.ProductAChainBuilder

fun main() {

    val builderA = ProductABuilder()
    val builderB = ProductBBuilder()
    val director = Director()

    director.constructProduct(builderA)
    val productA: ProductA = builderA.build()
    productA.print()

    director.constructProduct(builderB)
    val productB: ProductB = builderB.build()
    productB.print()

    val newProductA: ProductA = ProductAChainBuilder()
        .setFieldA(Any())
        .setFieldB(Any())
        .setFieldZ(Any())
        .build()

    newProductA.print()
}