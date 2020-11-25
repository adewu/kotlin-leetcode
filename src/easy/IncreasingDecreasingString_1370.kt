package easy

import java.lang.StringBuilder

class IncreasingDecreasingString_1370 {

    fun sortString(s: String): String {
        if (s.length < 2){
            return s
        }
        val slots = Array<Int>(26) {
            0
        }

        s.forEachIndexed { index, c ->
            slots[c - 'a'] =  slots[c - 'a'] + 1
        }

        var sb = StringBuilder()
        var count = s.length
        while (count != 0){
            if (count == 0){
                break
            }
           for (i in slots.indices){
               if (slots[i] != 0){
                   sb.append((i + 'a'.toInt()).toChar())
                   slots[i] = slots[i] - 1
                   count --
               }

           }
            for (j in slots.size - 1 downTo 0){
                if (count == 0){
                    break
                }
                if (slots[j] != 0){
                    sb.append((j + 'a'.toInt()).toChar())
                    slots[j] = slots[j] - 1
                    count --
                }
            }
        }
        return sb.toString()
    }


    fun exe(){
        print(sortString("leetcode"))
    }
}