package com.example.objectorientedprogramming.abstracts

fun main(args: Array<String>) {
    val car = Car(2021)
    car.speed = 200

    println("Car model is ${car.vehicleName("Toyota")} and the model is ${car.vehicleType("Car")} and the speed is ${car.speed} km/h and the model is ${car.model}")
}