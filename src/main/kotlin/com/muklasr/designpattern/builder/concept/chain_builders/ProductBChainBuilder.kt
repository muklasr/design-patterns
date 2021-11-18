package com.muklasr.designpattern.builder.concept.chain_builders

import com.muklasr.designpattern.builder.concept.ProductB

class ProductBChainBuilder {

    private lateinit var fieldA: Any
    private lateinit var fieldB: Any
    private lateinit var fieldZ: Any

    fun setFieldA(fieldA: Any): ProductBChainBuilder {
        this.fieldA = fieldA
        return this
    }

    fun setFieldB(fieldB: Any): ProductBChainBuilder {
        this.fieldB = fieldB
        return this
    }

    fun setFieldZ(fieldZ: Any): ProductBChainBuilder {
        this.fieldZ = fieldZ
        return this
    }

    fun build(): ProductB = ProductB(
        fieldA = fieldA,
        fieldB = fieldB,
        fieldZ = fieldZ,
    )
}