package com.example.myfirstproject

fun main(args: Array<String>) {
    print("Please enter a day of the week: ")
    var day:Int = readLine()!!.toInt()
    var dayString:String

    when (day) {
        1 -> dayString = "Sunday"
        2 -> dayString = "Monday"
        3 -> dayString = "Tuesday"
        4 -> dayString = "Wednesday"
        5 -> dayString = "Thursday"
        6 -> dayString = "Friday"
        7 -> dayString = "Saturday"
        else -> dayString = "Invalid day"
    }
    println("The day is $dayString.")
}