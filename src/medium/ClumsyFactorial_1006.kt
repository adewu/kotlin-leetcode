package medium

import java.util.*

class ClumsyFactorial_1006 {

    fun clumsy(N: Int): Int {

        val stack = LinkedList<Int>()
        stack.push(N)
        var n = N
        n--
        var index = 0
        while (n > 0){
            if (index % 4 == 0){
                stack.push(stack.pop() * n)
            }else if (index % 4 == 1){
                stack.push(stack.pop() / n)
            }else if (index % 4 == 2){
                stack.push(n)
            }else{
                stack.push(-n)
            }
            index++
            n--
        }
        var sum = 0
        while (stack.isNotEmpty()){
            sum += stack.pop()
        }

        return sum
    }

    fun exe(){
        print(clumsy(10))
    }
}