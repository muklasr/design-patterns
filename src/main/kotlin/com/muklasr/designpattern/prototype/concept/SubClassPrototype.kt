package com.muklasr.designpattern.prototype.concept

class SubClassPrototype : ConcretePrototype {

    var fieldB: String = ""

    constructor()
    constructor(concretePrototype: SubClassPrototype) : super(concretePrototype) {
        this.fieldB = concretePrototype.fieldB
    }


    override fun clone(): SubClassPrototype {
        return SubClassPrototype(this)
    }

    override fun equals(other: Any?): Boolean {
        if(other !is SubClassPrototype) return false
        return other.fieldB == fieldB
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + fieldB.hashCode()
        return result
    }
}