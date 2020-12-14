package medium

import java.util.*
import kotlin.collections.HashMap

class GroupAnagrams_49 {

    /**
     * 会存在字母累加和相等 但字母不同的情况
     */
    fun groupAnagramsFailure(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        val map = HashMap<Int, MutableList<String>>()
        val pareA = 'a' - 60
        //按字母相加结果分组 得到含有相同字母的数组
        strs.forEachIndexed { index, s ->
            //index = 0 s = eat
            var count = 0
            s.forEach {
                count += it - pareA
            }
            var list = map[count]
            if (list == null){
                val l = mutableListOf<String>()
                l.add(s)
                map[count] = l
            }else{
                list.add(s)
            }
        }
        //map中有三组词 分别对list重排加入结果列表
        map.forEach { t, u ->
            // t = 23 u = listof("eat","tea","ate")
            var cur = 0
            //对数组进行冒泡
            for (i in 0 until u.size){
                for (j in i + 1 until u.size){
                    if (u[i].length > cur && u[i][cur] - pareA > u[j][cur] - pareA){
                        val temp = u[i]
                        u[i] = u[j]
                        u[j] = temp
                    }
                }
                cur ++
            }
        }
        map.forEach { t, u ->
            result.add(u)
        }
        return result
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>>? {
        val map: MutableMap<String, MutableList<String>> = HashMap()
        for (str in strs) {
            val array = str.toCharArray()
            Arrays.sort(array)
            val key = String(array)
            val list = map.getOrDefault(key, ArrayList())
            list.add(str)
            map[key] = list
        }
        return ArrayList<List<String>>(map.values)
    }

    fun exe() {
        groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
    }
}