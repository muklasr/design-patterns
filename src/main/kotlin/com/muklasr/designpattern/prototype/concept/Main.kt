package com.muklasr.designpattern.prototype.concept

fun main() {
    val prototypeA = createPrototype()
    val prototypeB = prototypeA.clone()

    if (prototypeA !== prototypeB) {
        println("PrototypeA and PrototypeB are different objects")
        if (prototypeA == prototypeB) {
            println("PrototypeA and PrototypeB are identical")
        } else {
            println("PrototypeA and PrototypeB aren't identical.")
        }
    } else {
        println("PrototypeA and PrototypeB are same objects")
    }
}

fun createPrototype(): SubClassPrototype {
    val prototype = SubClassPrototype()
    prototype.fieldA = "field A"
    prototype.fieldB = "field B"
    return prototype
}
