package easy

class FindTheDifference_389 {

    fun findTheDifference(s: String, t: String): Char {

        if (s.isEmpty()){
            return t[0]
        }

        if (t.isEmpty()){
            return s[0]
        }

        var a = 0
        s.forEachIndexed { index, c ->
            a += c.toInt()
        }

        var b= 0
        t.forEachIndexed { index, c ->
            b += c.toInt()
        }

        return Math.abs(b - a).toChar()
    }

    fun exe(){
        findTheDifference("abcd","abcde")
    }

}