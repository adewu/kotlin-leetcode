package medium

class NumMatrix_304(val matrix: Array<IntArray>) {

    val preSum = Array<IntArray>(
            matrix.size + 1
    ) {
        IntArray(matrix[0].size){0}
    }

    init {
        for (i in 0 .. matrix.size){
            for (j in 0 .. matrix[0].size){
                preSum[i + 1][j + 1] = preSum[i][j + 1] + preSum[i + 1][j] - preSum[i][j] + matrix[i][j]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {

        return preSum[row2 + 1][col2 + 1] - preSum[row2 + 1][col1] - preSum[row1][col2 + 1] + preSum[row1][col1]
    }


    fun sumRegion1(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var res = 0
        for (i in row1..row2) {
            for (j in col1..col2) {
                res += matrix[i][j]
            }
        }

        return res
    }

}