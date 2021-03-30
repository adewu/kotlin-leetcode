package medium

class SearchA2DMatrix_74 {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in matrix.indices){
            if (matrix[i].isNotEmpty() && matrix[i][0] <= target && matrix[i][matrix[i].size - 1] >= target){
                for (j in matrix[i].indices){
                    if (matrix[i][j] == target){
                       return true
                    }
                }
            }
        }

        return false
    }

    fun exe(){

        print(searchMatrix(arrayOf(intArrayOf(1,3,5,7), intArrayOf(10,11,16,20), intArrayOf(23,30,34,60)),13))
    }
}