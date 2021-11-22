package com.muklasr.designpattern.adapter.examples.shapes

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(): RoundPeg() {

    private lateinit var peg: SquarePeg

    constructor(peg: SquarePeg) : this() {
        this.peg = peg
    }

    override fun getRadius(): Double {
        return (sqrt((peg.getWidth() / 2).pow(2) * 2));
    }
}