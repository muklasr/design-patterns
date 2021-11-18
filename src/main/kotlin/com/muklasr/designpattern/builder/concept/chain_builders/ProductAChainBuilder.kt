package com.muklasr.designpattern.builder.concept.chain_builders

import com.muklasr.designpattern.builder.concept.ProductA

class ProductAChainBuilder {

    private lateinit var fieldA: Any
    private lateinit var fieldB: Any
    private lateinit var fieldZ: Any

    fun setFieldA(fieldA: Any): ProductAChainBuilder {
        this.fieldA = fieldA
        return this
    }

    fun setFieldB(fieldB: Any): ProductAChainBuilder {
        this.fieldB = fieldB
        return this
    }

    fun setFieldZ(fieldZ: Any): ProductAChainBuilder {
        this.fieldZ = fieldZ
        return this
    }

    fun build(): ProductA = ProductA(
        fieldA = fieldA,
        fieldB = fieldB,
        fieldZ = fieldZ,
    )
}