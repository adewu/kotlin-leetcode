package medium

class FindMinimumRotatedSortedArray_153 {

    fun findMin(nums: IntArray): Int {
        var low = 0
        var high = nums.size - 1
        while(low < high){
            var pivot = low + (high - low) / 2
            if (nums[pivot] < nums[high]){
                high = pivot
            }else{
                low = pivot + 1
            }
        }
        return nums[low]
    }

    fun exe(){
        print(findMin(intArrayOf(3,4,5,1,2)))
    }
}