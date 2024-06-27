package com.example.myfirstproject

fun main(args: Array<String>) {
    // immutable map
    println("--- Immutable Map ---")
    var age = mapOf<String, Int>(
        "John" to 25,
        "Jane" to 22,
        "Jack" to 28
    )
    println("John is ${age["John"]} years old")
    println("Jane is ${age["Jane"]} years old")
    println("Jack is ${age["Jack"]} years old")

    // mutable map
    println("--- Mutable Map ---")
    var mutableAge = mutableMapOf<String, Int>(
        "John" to 25,
        "Jane" to 22,
        "Jack" to 28
    )
    mutableAge.put("Jill", 30)
    println("Jill is ${mutableAge["Jill"]} years old")
    println("John is ${mutableAge.get("John")} years old")
}