class PolaPlus() : Challenge1 {
    override fun barisBintang() {
        var panjang = 7
        val middle = panjang / 2

                for (i in 0..panjang) {
                    for (j in 0 ..panjang) {
//                        if (i == middle || j == middle)
                        if(i == panjang/2 || j == panjang/2){
                            print("*")
                        } else {
                            print(" ")
                        }
                    }
                    println()
                }
    }
}


