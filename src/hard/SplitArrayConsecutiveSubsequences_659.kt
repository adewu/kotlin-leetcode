package hard

import java.util.*
import kotlin.collections.HashMap

class SplitArrayConsecutiveSubsequences_659 {

    fun isPossible(nums: IntArray): Boolean {

        val map = HashMap<Int,PriorityQueue<Int>>()

        nums.forEach { x->
            if (!map.containsKey(x)){
                map[x] = PriorityQueue<Int>()
            }

            if (map.containsKey(x - 1)){
                val prevLength = map[x - 1]!!.poll()
                if (map[x - 1]?.isEmpty()!!){
                    map.remove(x -1)
                }
                map[x]?.offer(prevLength + 1)
            }else{
                map[x]?.offer(1)
            }
        }

        val entries = map.entries
        entries.forEach {entry->
            val queue = entry.value
            if (queue.peek() < 3){
                return false
            }
        }
        return true
    }

    fun exe() {
        isPossible(intArrayOf(1,2,3,3,4,4,5,5))
    }
}