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