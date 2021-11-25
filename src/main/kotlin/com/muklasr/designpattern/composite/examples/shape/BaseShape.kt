package com.muklasr.designpattern.composite.examples.shape

import java.awt.BasicStroke
import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D


abstract class BaseShape : Shape {

    private var x: Int = 0
    private var y: Int = 0
    lateinit var color: Color
    private var selected: Boolean = false

    constructor()
    constructor(x: Int, y: Int, color: Color) {
        this.x = x
        this.y = y
        this.color = color
    }

    override fun getX(): Int = this.x

    override fun getY(): Int = this.y

    override fun getWidth(): Int = 0

    override fun getHeight(): Int = 0

    override fun move(x: Int, y: Int) {
        this.x += x
        this.y += y
    }

    override fun isInsideBounds(x: Int, y: Int): Boolean {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight())
    }

    override fun select() {
        this.selected = true
    }

    override fun unSelect() {
        this.selected = false
    }

    override fun isSelected(): Boolean = this.selected

    open fun enableSelectionStyle(graphics: Graphics) {
        graphics.color = Color.LIGHT_GRAY
        val g2 = graphics as Graphics2D
        val dash1 = floatArrayOf(2.0f)
        g2.stroke = BasicStroke(
            1.0f,
            BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_MITER,
            2.0f, dash1, 0.0f
        )
    }

    open fun disableSelectionStyle(graphics: Graphics) {
        graphics.color = color
        val g2 = graphics as Graphics2D
        g2.stroke = BasicStroke()
    }

    override fun paint(graphics: Graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics)
        } else {
            disableSelectionStyle(graphics)
        }
    }

}