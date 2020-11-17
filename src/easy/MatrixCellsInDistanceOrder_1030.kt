package easy

import java.util.*

class MatrixCellsInDistanceOrder_1030 {
    fun allCellsDistOrder(R: Int, C: Int, r0: Int, c0: Int): Array<IntArray?> {
        val array = arrayOfNulls<IntArray>(C * R)
        for (i in 0 until R) {
            for (j in 0 until C) {
                array[i * C + j] = intArrayOf(i, j)
            }
        }
        Arrays.sort(array) { o1, o2 -> Math.abs(o1!![0] - r0) + Math.abs(o1[0] - c0) - (Math.abs(o2!![0] - r0) + Math.abs(o2[0] - c0)) }
        return array
    }

    fun exe() {
        allCellsDistOrder(2, 3, 1, 2)
    }
}