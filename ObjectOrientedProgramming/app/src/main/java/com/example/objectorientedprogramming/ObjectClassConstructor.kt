package com.example.objectorientedprogramming

fun main(args: Array<String>) {
    // create an object of MyCars class
//    var myCar = Cars()
//    myCar.name = "Toyota"
//    myCar.model = 2021
//
//    var myCar2 = Cars()
//    myCar2.name = "Honda"
//    myCar2.model = 2022
//
//    println("My car is ${myCar.name} and the model is ${myCar.model}")
//    println("My car is ${myCar2.name} and the model is ${myCar2.model}")

//    var myNewCar = MyCars("Toyota", 2021)
//    println("My car is ${myNewCar.name} and the model is ${myNewCar.model}")

    var mySecondCar = MySecondCars("Toyota", 2021)
    mySecondCar.name = "Mercedes"
    mySecondCar.model = 2022

    println("My car is ${mySecondCar.name} and the model is ${mySecondCar.model}")
}