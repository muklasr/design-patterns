package com.muklasr.designpattern.factory_method.examples.dialog

class IosDialog : Dialog() {
    override fun createButton(): Button {
        return IosButton()
    }
}