package com.example.myfirstproject

fun main(args: Array<String>) {
//    print("Please enter your age: ")
//    var age = readLine()!!.toInt()
//    if (age < 13) {
//        println("You are a child.")
//    } else if (age < 19) {
//        println("You are a teenager.")
//    } else {
//        if (age < 60) {
//            println("You are an adult.")
//        } else {
//            println("You are a senior citizen.")
//        }
//    }

    print("Please enter 3 numbers: ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()

    var max:Int

    if (num1 > num2) {
        if (num1 > num3) {
            max = num1
        } else {
            max = num3
        }
    } else {
        if (num2 > num3) {
            max = num2
        } else {
            max = num3
        }
    }

    println("The largest number is $max.")
}