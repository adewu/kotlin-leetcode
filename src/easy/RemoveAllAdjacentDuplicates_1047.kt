package easy

import java.lang.StringBuilder

class RemoveAllAdjacentDuplicates_1047 {

    fun removeDuplicates(S: String): String {
        val stack = StringBuffer()
        var top = -1
        for (i in S.indices){
            val ch = S[i]
            if (top >= 0 && stack[top] == ch){
                stack.deleteCharAt(top)
                --top
            }else{
                stack.append(ch)
                ++top
            }
        }
        return stack.toString()
    }

    fun exe(){
        print(removeDuplicates("aababaab"))
    }
}