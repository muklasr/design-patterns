package com.muklasr.designpattern.composite.examples.shape

import java.awt.Color
import java.awt.Graphics

class CompoundShape : BaseShape {

    protected val children: ArrayList<Shape> = ArrayList()

    constructor(vararg components: Shape) : super(0, 0, Color.BLACK) {
        add(*components)
    }

    fun add(component: Shape) {
        children.add(component)
    }

    fun add(vararg components: Shape) {
        children.addAll(components)
    }

    fun remove(child: Shape) {
        children.remove(child)
    }

    fun remove(vararg components: Shape) {
        children.removeAll(components.toSet())
    }

    fun clear() {
        children.clear()
    }

    override fun getX(): Int {
        if (children.size == 0) {
            return 0
        }
        var x = children[0].getX()
        for (child in children) {
            if (child.getX() < x) {
                x = child.getX()
            }
        }
        return x
    }

    override fun getY(): Int {
        if (children.size == 0) {
            return 0
        }
        var y = children[0].getY()
        for (child in children) {
            if (child.getY() < y) {
                y = child.getY()
            }
        }
        return y
    }

    override fun getWidth(): Int {
        var maxWidth = 0
        val x = getX()
        for (child in children) {
            val childsRelativeX = child.getX() - x
            val childWidth = childsRelativeX + child.getWidth()
            if (childWidth > maxWidth) {
                maxWidth = childWidth
            }
        }
        return maxWidth
    }

    override fun getHeight(): Int {
        var maxHeight = 0
        val y = getY()
        for (child in children) {
            val childsRelativeY = child.getY() - y
            val childHeight = childsRelativeY + child.getHeight()
            if (childHeight > maxHeight) {
                maxHeight = childHeight
            }
        }
        return maxHeight
    }

    override fun move(x: Int, y: Int) {
        for (child in children) {
            child.move(x, y)
        }
    }

    override fun isInsideBounds(x: Int, y: Int): Boolean {
        for (child in children) {
            if (child.isInsideBounds(x, y)) {
                return true
            }
        }
        return false
    }

    override fun unSelect() {
        super.unSelect()
        for (child in children) {
            child.unSelect()
        }
    }

    fun selectChildAt(x: Int, y: Int): Boolean {
        for (child in children) {
            if (child.isInsideBounds(x, y)) {
                child.select()
                return true
            }
        }
        return false
    }

    override fun paint(graphics: Graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics)
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1)
            disableSelectionStyle(graphics)
        }

        for (child in children) {
            child.paint(graphics)
        }
    }
}