package com.muklasr.designpattern.builder.concept

import com.muklasr.designpattern.builder.concept.builders.Builder

class Director {

    fun constructProduct(builder: Builder) {
        builder.setFieldA(Any())
        builder.setFieldB(Any())
        builder.setFieldZ(Any())
    }
}