package com.example.myfirstproject

import kotlin.random.Random

fun main(args: Array<String>) {
//    var i = 5
//    while (i > 0) {
//        println(i)
//        i--
//    }

    // 3 --> 3*2*1 5 --> 5*4*3*2*1
//    var k = 1
//    var fact = 1
//    while (k <= 5) {
//        fact *= k
//        println("$k! = $fact")
//        k++
//    }

    // infinite loop
    val number = Random.nextInt(1, 100)
    println("Please guess a number between 1 and 100")
    while (true) {
        val guess = readLine()!!.toInt()
        if (guess == number) {
            println("Congratulations! You guessed the number")
            break
        } else if (guess < number) {
            println("Please guess a higher number")
        } else {
            println("Please guess a lower number")
        }
    }
}