package com.muklasr.designpattern.factory_method.examples.dialog

class IosButton: Button {

    override fun render() {
        println("render: IosButton")
        onClick()
    }

    override fun onClick() {
        println("onClick: IosButton")
    }
}