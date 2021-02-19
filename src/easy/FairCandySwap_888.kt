package easy

class FairCandySwap_888 {

    fun fairCandySwap(A: IntArray, B: IntArray): IntArray {
        val ret = intArrayOf(0,0)
        var retOuter = 0
        A.forEach {
            retOuter += it
        }
        val retOuterTemp = retOuter
        var retInner = 0
        B.forEach {
            retInner += it
        }
        val retInnerTemp = retInner

        for (i in A.indices){
            for (j in B.indices){
                val i1 = A[i]
                val i2 = B[j]
                A[i] = i2
                B[j] = i1
                retOuter = retOuter - i1 + i2
                retInner = retInner - i2 + i1
                if (retOuter == retInner){
                    ret[0] = i1
                    ret[1] = i2
                    return ret
                }else{
                    A[i] = i1
                    B[j] = i2
                }
            }
            retOuter = retOuterTemp
            retInner = retInnerTemp
        }

        return ret
    }

    fun exe(){
        val fairCandySwap = fairCandySwap(intArrayOf(1, 1), intArrayOf(2, 2))
        fairCandySwap.forEach { print(it) }
    }
}