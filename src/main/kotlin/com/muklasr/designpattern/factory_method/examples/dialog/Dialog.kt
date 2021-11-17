package com.muklasr.designpattern.factory_method.examples.dialog

abstract class Dialog {

    fun renderWindow() {
        val okButton = createButton()
        okButton.render()
    }

    abstract fun createButton(): Button

}