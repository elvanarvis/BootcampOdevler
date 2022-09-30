package com.bootcamp.bootcampodevler.Odev2

fun main() {

    val odev2 = Odev2()

    val sonuc1 = odev2.soru1(100.0)
    println("Soru 1: $sonuc1")

    println("----------------")

    odev2.soru2(5, 10, 8, 12)

    println("----------------")

    val sonuc2 = odev2.soru3(5)
    println("Soru 3: $sonuc2")

    println("----------------")

    odev2.soru4("püsküüt", 'ü')

    println("----------------")

    val icacitop = odev2.soru5(6)
    println("Soru 5: $icacitop")

    println("----------------")

    val maas = odev2.soru6(30)
    println("Soru 6: $maas")

    println("----------------")

    val ucret = odev2.soru7(60)
    println("Soru 7: $ucret")

}