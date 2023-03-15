interface Challenge1{
    fun barisBintang()
}
//Pricillia Yusoko Putri

fun main(){
    val piramida = Piramid1()
    piramida.barisBintang()
    println("Pola Piramida1 \n")

    val  terbalik = PiramidaTerbalik()
    terbalik.barisBintang()
    println("Pola Piramida2 / Terbalik \n")

    val belahketupat = Ketupat()
    belahketupat.bentukBelahketupat()
    belahketupat.ketupat()
    println("Pola Belah Ketupat \n")

    val bentukX = BintangX()
    bentukX.barisBintang()
    println("Pola X \n")

    val segitiga2 = SikuSiku()
    segitiga2.segitigaSiku()
    println("Pola Segita Siku-Siku \n")

    val tambah = PolaPlus()
    tambah.barisBintang()
    println("Pola (+) Plus \n")
}