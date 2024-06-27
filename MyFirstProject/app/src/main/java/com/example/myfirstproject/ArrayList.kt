package com.example.myfirstproject

fun main(args: Array<String>) {
    var age = ArrayList<Int>()

    age.add(25)
    age.add(1, 30)
    age.add(35)

//    println("First Element: " + age[0])
//    println("Second Element: " + age.get(1))
//    println("Third Element: ${age[2]}")

    age.remove(30)
    println("Size of age array: " + age.size)

    var cars = arrayListOf<String>("BMW", "Audi", "Mercedes")
    cars.add("Toyota")
    println("First Element: " + cars[0])
    println("Second Element: " + cars.get(1))
    println("Third Element: ${cars[2]}")

    var myMixedArrayList = arrayListOf<Any>()
    myMixedArrayList.add("BMW")
    myMixedArrayList.add(25)
    myMixedArrayList.add(25.5)
    myMixedArrayList.add(true)
    myMixedArrayList.add('A')
    println("First Element: " + myMixedArrayList[0])
    println("Second Element: " + myMixedArrayList.get(1))
    println("Third Element: ${myMixedArrayList[2]}")
    println("Fourth Element: ${myMixedArrayList.get(3)}")
    println("Fifth Element: ${myMixedArrayList[4]}")

}