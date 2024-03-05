package org.example

fun main() {

    val nullList = listOfNotNull(5.toString())
    println("null List: $nullList")
    println("Liste Boyutu: ${nullList.size}")
    println("Listenin Elemanları: ")
    for (item in nullList){
        println(item)
    }
}