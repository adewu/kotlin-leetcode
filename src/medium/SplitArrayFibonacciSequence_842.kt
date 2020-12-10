package medium

class SplitArrayFibonacciSequence_842 {


    fun splitIntoFibonacci(S: String): List<Int> {
        val list = mutableListOf<Int>()
        backtrack(list,S,S.length,0,0,0)
        return list
    }

    private fun backtrack(list: MutableList<Int>, S: String, length: Int, index: Int, sum: Int, prev: Int) : Boolean{
        if (index == length){
            return list.size >= 3;
        }
        var currLong = 0L
        for (i in index until length){
            if (i > index && S[index] == '0'){
                break;
            }
            currLong = currLong * 10 + (S[i] - '0')
            if (currLong > Int.MAX_VALUE){
                break
            }
            var curr = currLong.toInt()
            if (list.size >= 2) {
                if (curr < sum) {
                    continue
                } else if (curr > sum) {
                    break
                }
            }
            list.add(curr)
            if (backtrack(list,S,length,i + 1,prev + curr ,curr)){
                return true
            }else{
                list.remove(list.size - 1)
            }
        }
        return false
    }

    fun exe(){
        splitIntoFibonacci("123456579")
    }
}