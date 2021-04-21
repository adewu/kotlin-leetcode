package medium

class DecodeWays_91 {

    fun numDecodings(s: String): Int {
        val n = s.length
        val f = IntArray(n + 1) { 0 }
        f[0] = 1
        for (i in 1 .. n){
            if (s[i - 1] != '0'){
                f[i] += f[i - 1]
            }
            if (i > 1 && s[i - 2] != '0' && ((s[i - 2] - '0') * 10 + (s[i - 1] - '0') <= 26)){
                f[i] += f[i - 2]
            }
        }
        return f[n]
    }

    fun exe(){
        print(numDecodings("226"))
    }
}