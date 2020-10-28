package easy

class UniqueNumberOfOccurrences_1207 {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int,Int>()
        arr.forEachIndexed { index, i ->
            val i1 = map[i]
            if (i1 == null){
                map[i] = 1
            }else{
                map[i] = i1 + 1
            }
        }
        val set = HashSet<Int>()
        map.forEach { t, u ->
            set.add(u)
        }
        return map.size == set.size
    }

    fun exe(){
        uniqueOccurrences(intArrayOf(1,2,2,1,1,3))
    }
}