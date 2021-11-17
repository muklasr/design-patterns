package com.muklasr.designpattern.factory_method.examples.dialog

class AndroidDialog : Dialog() {
    override fun createButton(): Button {
        return AndroidButton()
    }
}