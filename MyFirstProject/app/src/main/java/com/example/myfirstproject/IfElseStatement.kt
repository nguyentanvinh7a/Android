package com.example.myfirstproject

fun main(args: Array<String>) {
    print("Please enter a number: ")
    var number = readLine()!!.toInt()
    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }
}