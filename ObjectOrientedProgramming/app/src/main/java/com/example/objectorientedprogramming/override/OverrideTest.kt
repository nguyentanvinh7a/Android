package com.example.objectorientedprogramming.override

fun main(args: Array<String>) {
    // create an object from Vehicle class
    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    println("-------------------")

    // create an object from Car class
    var car = Car()
    car.superStart()
    car.superAccelerate(100)
    car.superStop()

    println("-------------------")

    car.start()
    car.accelerate(100)
    car.stop()

}