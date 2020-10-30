package easy

class IslandPerimeter_463 {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        if (grid.isEmpty()) {
            return 0
        }
        val m = grid.size
        val n = grid[0].size
        var count = 0
        var edge = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 0) {
                    continue
                }
                count++
                if (j + 1 < n && grid[i][j + 1] == 1) {
                    edge++
                }
                if (i + 1 < m && grid[i + 1][j] == 1) {
                    edge++
                }
            }
        }
        return 4 * count - 2 * edge
    }

    fun exe() {
        val intArray1 = intArrayOf(0, 1, 0, 0)
        val intArray2 = intArrayOf(1, 1, 1, 0)
        val intArray3 = intArrayOf(0, 1, 0, 0)
        val intArray4 = intArrayOf(1, 1, 0, 0)

        val matrix = arrayOf(intArray1, intArray2, intArray3, intArray4)
        islandPerimeter(matrix)
    }
}