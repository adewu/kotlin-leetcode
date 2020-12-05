package medium

import java.util.*

class TaskScheduler_621 {

    fun leastInterval1(tasks: CharArray, n: Int): Int {
       if (tasks.size <= 1 || n < 1){
           return tasks.size
       }
        val counts = IntArray(26)
        tasks.forEachIndexed { index, c ->
            counts[tasks[index] - 'A'] ++
        }
        Arrays.sort(counts)
        var maxCount = counts[25]
        var retCount = (maxCount -1) * (n + 1) + 1
        var i = 24
        while (i >= 0 && counts[i] == maxCount){
            retCount ++
            i--
        }
        return Math.max(retCount,tasks.size)
    }

    fun leastInterval(tasks: CharArray, n: Int): Int {
        var map = HashMap<Char,Int>()
        tasks.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        var largestCharCount = 0
        map.forEach { t, u ->
            if (u > largestCharCount){
                largestCharCount = u
            }
        }

        var samelargestCount = 0
        map.forEach { t, u ->
            if (u == largestCharCount){
                samelargestCount += 1
            }
        }

        var result = (largestCharCount - 1) * (n + 1) + 1

        if (samelargestCount > 1){
            result += samelargestCount - 1
        }

        if (result < tasks.size){
            result = tasks.size
        }

        return result
    }

    fun exe(){
        leastInterval(charArrayOf('A','A','A','B','B','B'),2)
    }
}