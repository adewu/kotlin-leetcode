package easy

import java.util.*

class AddStrings_415 {
    fun addStrings(num1: String, num2: String): String {
        var i = num1.length - 1
        var j = num2.length - 1
        var add = 0
        val sb = StringBuilder()
        while (i >= 0 || j >= 0 || add != 0){
            val x = if (i >= 0){
                num1[i] - '0'
            }else{
                0
            }
            val y = if (j >= 0){
                num2[j] - '0'
            }else{
                0
            }

            val result = x + y + add
            sb.append(result % 10)
            add = result / 10
            i--
            j--
        }
        sb.reverse()
        return sb.toString()
    }

    fun exe() {
        val first = "123"
        val second = "1234"
        print(addStrings(first, second))
    }

}