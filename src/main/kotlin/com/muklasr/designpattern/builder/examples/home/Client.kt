package com.muklasr.designpattern.builder.examples.home

fun main() {
    val builder = HomeBuilder()
    val director = Director()

    director.constructBuilder(builder)
    val home: Home = builder.buildHome()
}