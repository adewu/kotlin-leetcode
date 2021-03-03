package medium

class CountingBits_338 {

    fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)
        result[0] = 0
        for (i in 1 .. num){
            if (i % 2 == 1){
                result[i] = result[i - 1] + 1
            }else{
                result[i] = result[i / 2]
            }
        }

        return result
    }

    fun exe(){
        countBits(2)
    }

}