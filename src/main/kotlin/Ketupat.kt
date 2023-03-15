abstract class Belahketupat(){
    abstract fun ketupat()
    fun bentukBelahketupat(){

    }
}
class Ketupat(): Belahketupat() {
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