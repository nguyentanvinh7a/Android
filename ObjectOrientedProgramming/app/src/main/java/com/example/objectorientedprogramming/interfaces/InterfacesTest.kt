package com.example.objectorientedprogramming.interfaces

fun main(args: Array<String>) {
    var vehicles = Vehicles()

    println("Vehicle name is ${vehicles.name}")
    vehicles.go()
    vehicles.stop()
}