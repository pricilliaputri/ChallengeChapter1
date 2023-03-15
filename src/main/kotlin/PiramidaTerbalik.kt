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