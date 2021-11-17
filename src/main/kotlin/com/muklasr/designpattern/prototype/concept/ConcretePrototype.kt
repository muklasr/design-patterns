package com.muklasr.designpattern.prototype.concept

abstract class ConcretePrototype {

    var fieldA: String = ""

    constructor()
    constructor(concretePrototype: ConcretePrototype) {
        this.fieldA = concretePrototype.fieldA
    }


    abstract fun clone(): ConcretePrototype

    override fun equals(other: Any?): Boolean {
        if(other !is ConcretePrototype) return false
        return other.fieldA == fieldA
    }

    override fun hashCode(): Int {
        return fieldA.hashCode()
    }
}