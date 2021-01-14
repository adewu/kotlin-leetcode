package easy

import java.lang.StringBuilder

class BinaryPrefixDivisibleBy5_1018 {

    fun prefixesDivBy5L(A: IntArray): BooleanArray {
        var res = BooleanArray(A.size){
            false
        }

        A.forEachIndexed { index, i ->
            val sb = StringBuilder()
            for (i in 0 .. index){
                sb.append(A[i])
            }
            val toString = sb.toString()

            var ten = 0
            for (j in toString.indices){
                val parseInt = Integer.parseInt(toString[j].toString())
                val pow = Math.pow(2.0, (-(j - (toString.length - 1))).toDouble())
                ten +=  parseInt * pow.toInt()
            }

            res[index] = ten % 5 == 0
        }

        return res
    }


    fun prefixesDivBy5(A: IntArray): BooleanArray {
        val res = BooleanArray(A.size){
            false
        }

       var prefix = 0

        for (i in A.indices){
            prefix = ((prefix shl 1) + A[i]) % 5
            res[i] = prefix == 0
        }

        return res
    }

    fun exe(){
        prefixesDivBy5(intArrayOf(0,1,1,1,1,1))
    }
}