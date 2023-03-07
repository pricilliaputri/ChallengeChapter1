abstract class Belahketupat(){
    abstract fun ketupat()
    fun bentukBelahketupat(){
//        val bintang = 8
//        var bintang1 = 0
//        val n = 5
//        var space = n - 1
//        for (i in 1..n) {
//            for (j in 1..space) {
//                print(" ")
//            }
//            for (j in 1..(2*i-1)) {
//                print("*")
//            }
//            println()
//            space--
//        }
//        space = 1
//        for (i in (n-1) downTo 1) {
//
//            for (j in 1..space) {
//                print(" ")
//            }
//            for (j in 1..(2*i-1)) {
//                print("*")
//            }
//            println()
//            space++
//        }
    }
}

class SikuSiku(){
    fun segitigaSiku(){
        val bintang = 8

        for (i in 1..bintang) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}

class BintangX : Challenge1{
    override fun barisBintang() {

        val bintangX : Int = 7
        val bintang = bintangX * 2 - 1 ;

        for(i in 1..bintang){
            for(j in 1..bintang){
                if(j==i || (j==bintang - i + 1)){
                    print("*");
                }
                else
                {
                    print(" ");
                }
            }
            println("")
        }
    }
}