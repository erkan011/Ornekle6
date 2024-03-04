package org.example

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("Lütfen Yaşınızı Giriniz: ")

    val age = scanner.nextInt()

    println("Girdiğiğiniz Yaş: $age")

    scanner.close()
}