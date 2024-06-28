package com.example.objectorientedprogramming.override

class Car: Vehicle() {
    fun superStart() {
        super.start()
    }

    fun superAccelerate(speed: Int) {
        super.accelerate(speed)
    }

    fun superStop() {
        super.stop()
    }

    override fun start() {
        println("Car is starting")
    }

    override fun accelerate(speed: Int) {
        println("Car is accelerating at $speed km/h")
    }

    override fun stop() {
        println("Car is stopping")
    }
}