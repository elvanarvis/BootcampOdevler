package com.bootcamp.bootcampodevler.Odev2

class Odev2 {

    fun soru1(derece: Double): Double {
        val fahrenhiet = derece * 1.8 + 32
        return fahrenhiet
    }

    fun soru2(kenar1: Int, kenar2: Int, kenar3: Int, kenar4: Int) {
        val cevre = kenar1 + kenar2 + kenar3 + kenar4
        println("Soru 2: $cevre")
    }

    fun soru3(sayi: Int): Int {
        var sonuc = 1
        for (i in sayi downTo 1) {
            sonuc *= i
        }
        return sonuc
    }

    fun soru4(kelime: String, harf: Char) {
        var sayac = 0
        for (k in kelime) {
            if (k == harf)
                sayac++
        }
        println("$kelime içinde $sayac kadar $harf vardır.")
    }

    fun soru5(kenar: Int): Int {
        val icaci = (kenar - 2) * 180
        return icaci
    }

    fun soru6(gunSayisi: Int): Int {
        val saat = gunSayisi * 8
        var maas = 0
        if (saat > 160) {
            maas = 160 * 10 + (saat - 160) * 20
            return maas
        } else {
            maas = saat * 10
            return maas
        }
    }

    fun soru7(kota: Int): Int {
        var ucret = 100
        if (kota > 50) {
            ucret += (kota - 50) * 4
            return ucret
        } else
            return ucret
    }
}