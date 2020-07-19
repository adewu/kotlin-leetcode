package easy

import java.util.*

class MergeSortedArray_88 {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var index = 0
        for (i in m until nums1.size){
            nums1[m] = nums2[index]
            index ++
        }

        Arrays.sort(nums1)
    }

    fun exe(){
        val arr = intArrayOf(1, 2, 3, 0, 0, 0)
        val arr1 = intArrayOf(2,5,6)
        merge(arr,3,arr1,3)
    }
}