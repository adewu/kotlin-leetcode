package hard

class FindMinimumRotatedSortedArrayII_154 {

    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1
        while (low < high){
            val privot = low + (high - low) / 2
            if (nums[privot] < nums[high]){
                high = privot
            }else if (nums[privot] > nums[high]){
                low = privot + 1
            }else{
                high -= 1
            }
        }
        return nums[low]
    }

    fun exe(){
        print(findMin(intArrayOf(2,2,2,0,1)))
    }
}