package easy

class ReverseString_344 {

    fun reverseString(s: CharArray): Unit {
        if (s.size < 2){
            return
        }

        var index = 0

        while (index < s.size / 2){

           val temp = s[index]

            s[index] = s[s.size - index - 1]

            s[s.size - index - 1] = temp

            index ++
        }
    }

    fun exe(){
        reverseString(charArrayOf('h','e'))
    }
}