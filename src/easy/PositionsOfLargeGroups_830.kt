package easy

class PositionsOfLargeGroups_830 {

    fun largeGroupPositions(s: String): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        var index = 0
        while(index  < s.length - 1){
            val start = index
            var end = start
            for (i in index + 1 until s.length){
                if (s[index] == s[i]){
                    end ++
                    index ++
                }else{
                    index ++
                    break
                }
            }
            if (end + 1 - start >= 3){
                result.add(listOf(start,end ))
                index = end + 1
            }
        }
        return result
    }

    fun exe(){
        largeGroupPositions("abbxxxxzzy")
    }
}