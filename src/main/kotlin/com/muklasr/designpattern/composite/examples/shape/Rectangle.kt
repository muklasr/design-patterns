package com.muklasr.designpattern.composite.examples.shape

import java.awt.Color
import java.awt.Graphics

class Rectangle(x: Int, y: Int, private val width: Int, private val height: Int, color: Color) :
    BaseShape(x, y, color) {

    private val DOT_SIZE: Int = 3

    override fun getWidth(): Int = DOT_SIZE

    override fun getHeight(): Int = DOT_SIZE

    override fun paint(graphics: Graphics) {
        super.paint(graphics)
        graphics.drawRect(getX(), getY(), getWidth() - 1, getHeight() - 1);
    }
}