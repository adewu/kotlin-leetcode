package medium

import java.util.*

class SpiralMatrix_54 {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val res = mutableListOf<Int>()
        if (matrix.isNullOrEmpty() || matrix[0].isEmpty()){
            return res
        }

        val total = matrix.size * matrix[0].size
        val rows = matrix.size
        val columns = matrix[0].size
        val visited = Array<BooleanArray>(matrix.size){
            BooleanArray(matrix[0].size){false}
        }
        var row = 0
        var column = 0
        val directions = arrayOf(intArrayOf(0,1), intArrayOf(1,0), intArrayOf(0,-1), intArrayOf(-1,0))
        var dircetionIndex = 0

        for (i in 0 until total){
            res.add(matrix[row][column])
            visited[row][column] = true
            val nextRow = row + directions[dircetionIndex][0]
            val nextColumn = column + directions[dircetionIndex][1]
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn]){
                dircetionIndex = (dircetionIndex + 1) % 4
            }
            row += directions[dircetionIndex][0]
            column += directions[dircetionIndex][1]
        }
        return res
    }

    fun exe(){
        spiralOrder(arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9)))
    }
}