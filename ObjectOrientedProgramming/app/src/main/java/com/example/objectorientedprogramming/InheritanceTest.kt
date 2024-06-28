package com.example.objectorientedprogramming

fun main(args: Array<String>) {
    // create an object of Car class
    var car = Car()
    car.type = "Car"
    car.model = "Toyota"
    car.maxSpeed = 200

    car.show()

    // create an object of Motocycle class
    var motocycle = Motocycle()
    motocycle.type = "Motocycle"
    motocycle.model = "Yamaha"
    motocycle.maxSpeed = 150

    motocycle.show()

}