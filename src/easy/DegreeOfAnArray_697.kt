package easy

class DegreeOfAnArray_697 {

    fun findShortestSubArray1(nums: IntArray): Int {
        var res = nums.size
        var degree = 0
        val intArray = IntArray(nums.size){
            0
        }
        nums.forEachIndexed { index, i ->
            intArray[i] = intArray[i] + 1
        }
        intArray.forEachIndexed { index, i ->
            if (i > degree){
                degree = i
            }
        }
        val smallestDegreeNums = mutableListOf<Int>()
        intArray.forEachIndexed { index, i ->
            if (degree == i) {
                smallestDegreeNums.add(index)
            }
        }
        smallestDegreeNums.forEachIndexed { i, j ->
            var index = 0
            var left = 0
            var right = 0
            while (index < nums.size){
                if (nums[index] == j ){
                    left = index
                     break
                }
                index ++
            }

            index = nums.size - 1
            while (index > 0){
                if (nums[index] == j ){
                    right = index
                    break
                }
                index--
            }

            var temp = right - left
            if (temp < res){
                res = temp
            }
        }

        return res + 1
    }

    fun findShortestSubArray(nums: IntArray): Int {
        val map = HashMap<Int, IntArray>()
        nums.forEachIndexed { index, i ->
            if (map.containsKey(i)){
                map[i]!![0] = map[i]!![0] + 1
                map[i]!![2] = index
            }else{
                map[i] = intArrayOf(1,index,index)
            }
        }
        var maxNum = 0
        var minLen =0
        map.forEach { t, u ->
            if (maxNum < u[0]){
                maxNum = u[0]
                minLen = u[2] - u[1] + 1
            }else if (maxNum == u[0]){
                if (minLen > u[2] - u[1] + 1){
                    minLen = u[2] - u[1] + 1
                }
            }
        }

        return minLen
    }

    fun exe(){
        findShortestSubArray(intArrayOf(1))
    }
}