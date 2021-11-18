package com.muklasr.designpattern.builder.concept.builders

import com.muklasr.designpattern.builder.concept.ProductB

class ProductBBuilder : Builder {

    private lateinit var fieldA: Any
    private lateinit var fieldB: Any
    private lateinit var fieldZ: Any

    override fun setFieldA(fieldA: Any) {
        this.fieldA = fieldA
    }

    override fun setFieldB(fieldB: Any) {
        this.fieldB = fieldB
    }

    override fun setFieldZ(fieldZ: Any) {
        this.fieldZ = fieldZ
    }

    fun build(): ProductB = ProductB(
        fieldA = fieldA,
        fieldB = fieldB,
        fieldZ = fieldZ,
    )
}