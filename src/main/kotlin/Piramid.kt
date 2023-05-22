class Piramid():Challenge1{
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


