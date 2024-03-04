package org.example

fun main() {
    for (i in 1..5){
        if (i==3){
            continue
        }
        println("i: $i")
    }
    erkan()
}

fun erkan() {
    for (i in 1..100) {
        if (i == 100) {
            continue
        }
        print("i: $i")
    }
}