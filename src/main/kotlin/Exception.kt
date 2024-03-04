package org.example

fun main() {
    //try-catch-finally istisna bululunduran durumlarda bu kısmı kullanacağız
    try {
        val result = 10/0
        println(result)
    }catch (e: Exception) {
        println("Bir İstisna Oluştu: ${e.message}")

    }finally {
        println("try-catch bloğu tamamlandı")
    }
}