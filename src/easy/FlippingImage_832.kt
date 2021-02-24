package easy

import java.util.*

class FlippingImage_832 {

    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
        for (i in A.indices){
            A[i].reverse()
            for (j in A[i].indices){
               if (A[i][j] == 0){
                   A[i][j] = 1
               }else{
                   A[i][j] = 0
               }
            }
        }
        return A
    }

    fun exe(){
        flipAndInvertImage(arrayOf(intArrayOf(1,1,0,0), intArrayOf(1,0,0,1), intArrayOf(0,1,1,1), intArrayOf(1,0,1,0)))
    }
}