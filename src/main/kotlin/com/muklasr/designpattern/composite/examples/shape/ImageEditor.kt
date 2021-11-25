package com.muklasr.designpattern.composite.examples.shape

import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.BorderFactory
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants
import javax.swing.border.Border


class ImageEditor {
    private val canvas: EditorCanvas
    private val allShapes = CompoundShape()

    companion object {
        private const val PADDING = 10
    }

    fun loadShapes(vararg shapes: Shape) {
        allShapes.clear()
        allShapes.add(*shapes)
        canvas.refresh()
    }

    private inner class EditorCanvas : Canvas() {
        lateinit var frame: JFrame
        fun createFrame() {
            frame = JFrame()
            frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            frame.setLocationRelativeTo(null)
            val contentPanel = JPanel()
            val padding: Border = BorderFactory.createEmptyBorder(
                PADDING,
                PADDING,
                PADDING,
                PADDING
            )
            contentPanel.border = padding
            frame.contentPane = contentPanel
            frame.add(this)
            frame.isVisible = true
            frame.contentPane.background = Color.LIGHT_GRAY
        }

        override fun getWidth(): Int = allShapes.getX() + allShapes.getWidth() + PADDING
        override fun getHeight(): Int = allShapes.getY() + allShapes.getHeight() + PADDING

        fun refresh() {
            this.setSize(width, height)
            frame.pack()
        }

        override fun paint(graphics: Graphics) {
            allShapes.paint(graphics)
        }

        init {
            createFrame()
            refresh()
            addMouseListener(object : MouseAdapter() {
                override fun mousePressed(e: MouseEvent) {
                    allShapes.unSelect()
                    allShapes.selectChildAt(e.x, e.y)
                    e.component.repaint()
                }
            })
        }
    }

    init {
        canvas = EditorCanvas()
    }
}