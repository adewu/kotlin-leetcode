package easy

class SquaresOfASortedArray_977 {

    fun sortedSquares(A: IntArray): IntArray {
        for (i in A.indices){
            A[i] = A[i] * A[i]
        }
        A.sort()
        return A
    }

    fun exe(){
        sortedSquares(intArrayOf(-4,-1,0,3,10))
    }
}