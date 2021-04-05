package easy

import java.util.*

class MergeSortedArray_88 {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0 until n) {
            nums1[m + i] = nums2[i]
        }
        Arrays.sort(nums1)
    }

    fun exe(){
        val arr = intArrayOf(1, 2, 3, 0, 0, 0)
        val arr1 = intArrayOf(2,5,6)
        merge(arr,3,arr1,3)
    }
}