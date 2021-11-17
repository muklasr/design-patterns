package com.muklasr.designpattern.factory_method.concept

private lateinit var creator: Creator

fun main() {
    configure()
    runOperation()
}

private fun configure() {
    creator = CreatorA()
//    creator = CreatorB()
}

private fun runOperation() {
    creator.someOperation()
}