package com.example.myfirstproject

fun main(args: Array<String>) {
    var age = arrayOf(25, 30, 35, 40, 45)
    println("First Element: " + age[0])
    println("Second Element: " + age.get(1))
    println("Third Element: " + age[2])

    var cars = arrayOf("BMW", "Audi", "Mercedes")
    println("-------------------")
    println("First Element: " + cars[0])
    println("Second Element: " + cars.get(1))
    println("Third Element: " + cars[2])
    println("-------------------")
    cars.set(1, "Toyota")
    println("Second Element: " + cars.get(1))

    println("Size of cars array: " + cars.size)

    var carsAndAge = arrayOf("BMW", 25, "Audi", 30, "Mercedes", 35)
    println("-------------------")
    println("First Element: " + carsAndAge[0])
    println("Second Element: " + carsAndAge.get(1))
    println("Third Element: " + carsAndAge[2])
    println("Fourth Element: " + carsAndAge.get(3))
}