package easy

class ToeplitzMatrix_766 {

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for (i in 0 until matrix.size - 1){
            for (j in 0 until matrix[0].size - 1){
                if (matrix[i][j] != matrix[i+1][j + 1]){
                    return false
                }
            }
        }
        return true
    }

    fun exe(){
        isToeplitzMatrix(arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,1,2,3), intArrayOf(9,5,1,2)))
    }
}