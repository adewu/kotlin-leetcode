package medium

import java.util.*

class KthSmallestElementInSortedMatrix_378 {

    fun kthSmallest1(matrix: Array<IntArray>, k: Int): Int {
        if (matrix.isEmpty()) {
            return 0
        }
        val n = matrix[0].size
        val array = arrayOfNulls<Int>(n * n)
        matrix.forEachIndexed { index, ints ->
            ints.forEachIndexed { i, value ->
                array[(index * n) + i] = value
            }
        }

        Arrays.sort(array)
        return array[k - 1]!!
    }

    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        val priorityQueue = PriorityQueue<IntArray>(Comparator { o1: IntArray, o2: IntArray -> return@Comparator o1[0] - o2[0] })
        val n = matrix.size

        for (i in 0 until n){
            priorityQueue.offer(intArrayOf(matrix[i][0],i,0))
        }
        for (j in 0 until k - 1){
            val array = priorityQueue.poll()
            if (array[2] != n - 1){
                priorityQueue.offer(intArrayOf(matrix[array[1]][array[2] + 1],array[1],array[2] + 1))
            }
        }
        return priorityQueue.poll()[0]
    }

    fun exe() {
        val intArray1 = intArrayOf(1, 5, 9)
        val intArray2 = intArrayOf(10, 11, 13)
        val intArray3 = intArrayOf(12, 13, 15)
        val matrix = arrayOf(intArray1, intArray2, intArray3)
        print(kthSmallest(matrix, 8))
    }
}