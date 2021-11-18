package com.muklasr.designpattern.builder.examples.home

class Director {

    fun constructBuilder(builder: HomeBuilder){
        builder.buildDoors(6)
        builder.buildWindows(8)
        builder.buildRooms(5)
    }

}