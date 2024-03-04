package org.example

fun main() {

    //toIntOrNull()
    val strnumber1 = "123"
    val strnumber2 = "abc"

    val number1:Int?=strnumber1.toIntOrNull()
    val number2:Int?=strnumber2.toIntOrNull()
    println("number1: $number1")
    println("number2: $number2")
}