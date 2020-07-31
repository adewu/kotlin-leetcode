package easy

class MagicIndexLCCI {

    fun findMagicIndex(nums: IntArray): Int {
        nums.forEachIndexed { index, i ->
            if (index == i){
                return i
            }
        }
        return -1
    }

    fun exe(){
        val intArrayOf = intArrayOf(1,1,1)
        print(findMagicIndex(intArrayOf))
    }
}