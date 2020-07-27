package easy

class IsSubSequence_392 {

    /**
     * 0 <= s.length <= 100
    0 <= t.length <= 10^4
    Both strings consists only of lowercase characters.
     */

    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()){
            return true
        }
        if (t.isEmpty()){
            return false
        }
        val sArray = s.toCharArray()
        val tArray = t.toCharArray()
        var sIndex = 0
        var tIndex = 0
        while (tIndex < tArray.size ){
            if (sArray[sIndex] == tArray[tIndex]){
                if (sIndex == sArray.size - 1 ){
                    return true
                }
                sIndex ++
                tIndex ++
            }else{
                tIndex ++
            }
        }

        return false
    }

    fun exe(){
        val s = "abc"
        val t = ""
        print(isSubsequence(s,t))
    }
}