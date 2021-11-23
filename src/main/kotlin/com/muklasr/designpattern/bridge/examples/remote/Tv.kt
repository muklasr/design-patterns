package com.muklasr.designpattern.bridge.examples.remote

class Tv : Device {

    private var on: Boolean = false
    private var volume: Int = 30
    private var channel: Int = 1

    override fun isEnabled(): Boolean = on

    override fun enable() {
        this.on = true
    }

    override fun disable() {
        this.on = false
    }

    override fun getVolume(): Int = volume

    override fun setVolume(percent: Int) {
        if (percent > 100)
            this.volume = 100
        else if (percent < 0)
            this.volume = 0
        else
            this.volume = percent
    }

    override fun getChannel(): Int = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }

    override fun printStatus() {
        println("------------------------------------")
        println("| I'm TV set.")
        println("| I'm " + if (on) "enabled" else "disabled")
        println("| Current volume is $volume%")
        println("| Current channel is $channel")
        println("------------------------------------\n")
    }
}