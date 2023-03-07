//class Piramid1:Gataudeh() {
//   override fun baris(baris1: Int) {
////        super.baris1()
//        for (i in 1..baris1) {
//            for (k in i..(baris1 - 1)) {
//
//                for (j in 1..1 * i - 1) {
//                    print("*")
//                }
//
//            }
//        }
//    }
//}
//fun main(){
//   val cobain = Gataudeh()
//    cobain.Piramid()
//}

class Piramid1():Challenge1{
    override fun barisBintang() {
        var polaPiramid1 = 8
        var j = 0

        for (i in 1..polaPiramid1) {
            for (i in 1..polaPiramid1 - i) {
                print(" ")
            }
            while (j != 2 * i - 1) {
                print("*")
                ++j
            }
            println()
            j = 0
        }
    }
}

class PiramidaTerbalik():Challenge1{
    override fun barisBintang() {
        val bintang1 = 8
        for (i in bintang1 downTo 1) {
            for (bintang1 in 1..bintang1 - i) {
                print("  ")
            }
            for (j in i..2 * i - 1) {
                print("* ")
            }
            for (j in 0..i - 1 - 1) {
                print("* ")
            }
            println()
        }
    }
}

class Ketupat():Belahketupat() {
    override fun ketupat() {
        val n = 8
        var space = n - 1
        for (i in 1..n) {
            for (j in 1..space) {
                print(" ")
            }

            for (j in 1..(2*i-1)) {
                print("*")
            }
            println()
            space--
        }

        space = 1
        for (i in (n-1) downTo 1) {

            for (j in 1..space) {
                print(" ")
            }

            for (j in 1..(2*i-1)) {
                print("*")
            }
            println()
            space++
        }
    }
}

class PolaPlus() : Challenge1 {
    override fun barisBintang() {
        var panjang = 7
        val middle = panjang / 2

                for (i in 0..panjang) {
                    for (j in 0 ..panjang) {
                        if (i == middle || j == middle) {
                            print("*")
                        } else {
                            print(" ")
                        }
                    }
                    println()
                }
    }
}