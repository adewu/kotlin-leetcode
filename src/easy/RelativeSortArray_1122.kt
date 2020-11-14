package easy

class RelativeSortArray_1122 {

    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val tempArr = Array<MutableList<Int>>(arr2.size){
            mutableListOf()
        }
        arr2.forEachIndexed { index, i ->
            tempArr[index].add(i)
        }
        val ascendArr = mutableListOf<Int>()
        arr1.forEachIndexed { i, a1 ->
            var has = false
            arr2.forEachIndexed { j, a2 ->
                if (a1 == tempArr[j][0]){
                    tempArr[j].add(a2)
                    has = true
                }
            }
            if (!has){
                ascendArr.add(a1)
            }
        }
        ascendArr.sort()
        val result = mutableListOf<Int>()
        tempArr.forEachIndexed { index, mutableList ->
            for (i in 0 until mutableList.size - 1) {
                result.add(mutableList[i])
            }
        }
        result.addAll(ascendArr)
        return result.toIntArray()
    }


    fun exe(){
        val arr1 = intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 10)
        val arr2 = intArrayOf(2,1,4,3,9,6)
        relativeSortArray(arr1, arr2)
    }
}