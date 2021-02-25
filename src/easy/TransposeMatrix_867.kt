package easy

class TransposeMatrix_867 {

    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val res = Array<IntArray>(matrix[0].size) {
            IntArray(matrix.size) {
                0
            }
        }

        for (i in matrix.indices){
            for (j in matrix[i].indices){
                res[j][i] = matrix[i][j]
            }
        }

        return res
    }

    fun exe(){
        transpose(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6)))
    }
}