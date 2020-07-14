package easy

class IntersectionOfTwoArrays_349 {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val hashSet1 = HashSet<Int>()
        val hashSet2 = HashSet<Int>()

        nums1.forEach {
            hashSet1.add(it)
        }
        nums2.forEach {
            hashSet2.add(it)
        }

        hashSet1.retainAll(hashSet2)


        val resultArray = Array<Int>(hashSet1.size) {0}
        hashSet1.forEachIndexed { index, i ->
            resultArray[index] = i
        }

        return resultArray.toIntArray()
    }

    fun exe(){
        val array1 = intArrayOf(1, 2, 2, 1)
        val array2 = intArrayOf( 2, 2)
        intersection(array1,array2)
    }


}