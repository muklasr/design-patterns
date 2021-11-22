package com.muklasr.designpattern.adapter.examples.shapes

import kotlin.math.pow

class SquarePeg(private val width: Double) {

    fun getWidth(): Double {
        return width
    }

    fun getSquare(): Double {
        return width.pow(2)
    }
}