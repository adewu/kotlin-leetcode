package easy

class SortArrayByParity2_922 {

    fun sortArrayByParityII(A: IntArray): IntArray {
        val length = A.size
        var j = 1;
        for (i in 0 until length step 2){
            if (A[i] % 2 == 1){
                while (A[j] % 2 == 1){
                    j+= 2
                }
                swap(A,i,j)
            }
        }
        return A
    }

     fun swap( A : IntArray, i : Int, j : Int) {
        val temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


    fun exe(){
        sortArrayByParityII(intArrayOf(4,2,5,7))
    }
}