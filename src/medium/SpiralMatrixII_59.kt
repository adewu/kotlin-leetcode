package medium

class SpiralMatrixII_59 {

    fun generateMatrix(n: Int): Array<IntArray> {
        val res = Array<IntArray>(n) {
            IntArray(n) { -1 }
        }

        val total = res.size * res[0].size
        val rows = res.size
        val columns = res[0].size
        var row = 0
        var column = 0
        val directions = arrayOf(intArrayOf(0,1), intArrayOf(1,0), intArrayOf(0,-1), intArrayOf(-1,0))
        var dircetionIndex = 0

        for (i in 0 until total){
            res[row][column] = n
            val nextRow = row + directions[dircetionIndex][0]
            val nextColumn = column + directions[dircetionIndex][1]
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || res[nextRow][nextColumn] != -1){
                dircetionIndex = (dircetionIndex + 1) % 4
            }
            row += directions[dircetionIndex][0]
            column += directions[dircetionIndex][1]
        }


        return res
    }

    fun exe(){
        generateMatrix(3)
    }
}