package easy

class RobotReturnToOrigin_657 {
    fun judgeCircle(moves: String): Boolean {
        val hashMap = HashMap<Char, Int>(4)
        hashMap['U'] = -1
        hashMap['D'] = 1
        hashMap['L'] = -2
        hashMap['R'] = 2
        var result = Int.MAX_VALUE
        moves.forEach {
            if (result == Int.MAX_VALUE){
                result = 0
            }
            if (hashMap[it] != null) {
                result += hashMap[it]!!
            }
        }
        return result == 0
    }

    fun exe(){
        print(judgeCircle("LDRRLRUULR"))
    }
}