package com.muklasr.designpattern.bridge.examples.remote

class AdvancedRemote : BasicRemote {

    constructor(device: Device) : super(device)

    fun mute() {
        println("Remote: channel down")
        device.setChannel(device.getChannel() - 1)
    }
}