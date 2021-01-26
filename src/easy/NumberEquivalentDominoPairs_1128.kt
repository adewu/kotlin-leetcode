package easy

class NumberEquivalentDominoPairs_1128 {


    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val array = Array<Int>(100){0}
        var ret = 0
        dominoes.forEachIndexed { index, ints ->
            var i = 0
            if (ints[0] < ints[1] ){
                i = ints[1] * 10 + ints[0]
            }else{
                i = ints[0] * 10 + ints[1]
            }
            ret += array[i]
            print(ret)
            array[i] ++
        }
        return ret
    }

    fun exe(){
        numEquivDominoPairs(arrayOf(intArrayOf(1,2), intArrayOf(1,2), intArrayOf(1,1), intArrayOf(1,2), intArrayOf(2,2)))
    }
}