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