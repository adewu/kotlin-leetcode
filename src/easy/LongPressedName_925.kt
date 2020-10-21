package easy

class LongPressedName_925 {

    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = 0
        var j = 0
        while (j < typed.length) {
            if (i < name.length && name[i] == typed[j]) {
                i++
                j++
            } else if (j > 0 && typed[j] == typed[j - 1]) {
                j++
            } else {
                return false
            }
        }
        return i == name.length
    }

    fun exe() {
        isLongPressedName("leelee", "lleeelee")
    }
}