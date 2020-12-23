package easy

class FirstUniqueCharacterInString_387 {
    fun firstUniqChar(s: String): Int {
        val map = LinkedHashMap<Char, Int>()
        s.forEachIndexed { index, c ->
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for ((key,value) in map){
            if (value == 1) {
                return s.indexOfFirst {
                    it == key
                }
            }
        }
        return -1
    }

    fun exe() {
        print(firstUniqChar("dddccdbba"))
    }
}