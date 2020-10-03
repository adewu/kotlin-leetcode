package easy

class JewelsAndStones_771 {

    fun numJewelsInStones(J: String, S: String): Int {
        val charArray = J.toCharArray()
        var result  = 0
        charArray.forEachIndexed { index, j ->
            S.forEachIndexed { index, s ->
                if (j == s){
                    result ++
                }
            }
        }
        return result
    }

    fun exe(){
        print(numJewelsInStones("aA","aAAbbbb"))
    }
}