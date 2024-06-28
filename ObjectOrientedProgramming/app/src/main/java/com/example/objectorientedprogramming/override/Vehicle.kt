package com.example.objectorientedprogramming.override

open class Vehicle {

    open fun start() {
        println("Vehicle is starting")
    }

    open fun accelerate(speed: Int) {
        println("Vehicle is accelerating at $speed km/h")
    }

    open fun stop() {
        println("Vehicle is stopping")
    }
}