package easy

import java.util.*


class ValidParentheses_20 {
    fun isValid(s: String): Boolean {
        if (s.length % 2 == 1){
            return false
        }

        val pairs: Map<Char, Char> = object : HashMap<Char, Char>() {
            init {
                put(')', '(')
                put(']', '[')
                put('}', '{')
            }
        }

        val stack = LinkedList<Char>();

        for (element in s){
            if (pairs.containsKey(element)){
                if (stack.isEmpty() || stack.peek() != pairs[element]){
                    return false
                }
                stack.pop()
            }else{
                stack.push(element)
            }
        }
        return stack.isEmpty()
    }

   fun exe(){
        val str = "()[]{}"
       print(isValid(str))
    }
}