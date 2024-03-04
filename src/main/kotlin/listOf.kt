package org.example

fun main() {

    //String üzerinde bir liste oluşturmak
    val numbers = listOf("one", "three", "two", "four", "five")

    //Oluşturulann listeyi yazdırmak
    println("Numbers: $numbers")

    //Listenin elemanlarına erişmek
    println("İlk Elemanı: ${numbers[0]}")
    println("son Elemanı: ${numbers[numbers.size-1]}")

    //Listede Döngü kullanarak Elemankları Yazdırmak
    println("Liste Elemanları: ")
    for (item in numbers){
        println(item)
    }
}