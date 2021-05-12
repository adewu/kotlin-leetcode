package medium

class XORQueriesOfASubarray_1310 {

    /**
     * query 数组是arr的下标L R
     */
    fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {

        val ret = IntArray(queries.size){0}
        for (i in queries.indices){
            val l = queries[i][0]
            val r = queries[i][1]
            if (l - r == 0){
                ret[i] = arr[l]
            }else {
                var res = arr[l]
                for (j in l + 1..r) {
                    res = res xor arr[j]
                }
                ret[i] = res
            }
        }

        return ret
    }

    fun exe(){
        xorQueries(intArrayOf(16), arrayOf(intArrayOf(0,0),intArrayOf(0,0),intArrayOf(0,0)))
    }
}