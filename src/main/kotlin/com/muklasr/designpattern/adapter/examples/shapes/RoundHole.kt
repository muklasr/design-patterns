package com.muklasr.designpattern.adapter.examples.shapes

class RoundHole(private val radius: Double) {

    private fun getRadius(): Double {
        return radius
    }

    fun fits(peg: RoundPeg): Boolean {
        return getRadius() >= peg.getRadius()
    }

}