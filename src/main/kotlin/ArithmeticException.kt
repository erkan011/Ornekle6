package org.example

//ArithmeticException bir sayıyı sıfıra bölmeye çalıştığımızda veye sayılar arası bir uyumsuzluk olduğunda kullanılır
fun main() {
    val num1 = 10
    val num2 = 0

    try {
        val result = num1 / num2
        println("Sonuç: $result")
    }catch (e: ArithmeticException){
        println("Sıfıra Bölme Hatası: ${e.message}")
    }
}