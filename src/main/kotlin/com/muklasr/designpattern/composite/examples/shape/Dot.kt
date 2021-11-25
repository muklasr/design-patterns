package com.muklasr.designpattern.composite.examples.shape

import java.awt.Color
import java.awt.Graphics

class Dot(x: Int, y: Int, color: Color) : BaseShape(x, y, color) {

    private val DOT_SIZE: Int = 3

    override fun getWidth(): Int = DOT_SIZE

    override fun getHeight(): Int = DOT_SIZE

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.fillRect(getX() - 1, getY() - 1, getWidth(), getHeight())
    }
}