package easy

class ReverseBits_190 {

    fun reverseBits(n: Int): Int {
        var res = 0
        var i = 0
        var tmp = n
        while (i < 32 && tmp != 0) {
            res = res or (tmp and 1 shl 31 - i)
            tmp = tmp ushr 1
            ++i
        }

        return res
    }

    fun exe() {

    }
}