package com.muklasr.designpattern.factory_method.examples.dialog

class AndroidButton: Button {

    override fun render() {
        println("render: AndroidButton")
        onClick()
    }

    override fun onClick() {
        println("onClick: AndroidButton")
    }
}