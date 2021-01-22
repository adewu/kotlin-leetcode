package easy

import java.math.BigDecimal
import java.util.*

class Add2ArrayFormOfInteger_989 {

    fun addToArrayForm(A: IntArray, K: Int): List<Int> {
        val size = A.size
        var lastNum = K
        val ret = LinkedList<Int>()
        var i = size - 1
        while (i >= 0 || lastNum > 0){
            if (i >= 0){
                lastNum += A[i]
            }
            ret.addFirst(lastNum % 10)
            lastNum/=10
            i--
        }
        return ret
    }

    fun exe(){
        addToArrayForm(intArrayOf(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3),1)
    }
}