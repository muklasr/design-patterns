package com.muklasr.designpattern.factory_method.examples.dialog

private lateinit var dialog: Dialog

fun main() {
    configure()
    render()
}

private fun configure() {
    dialog = AndroidDialog()
//    dialog = IosDialog()
}

private fun render() {
    dialog.renderWindow()
}