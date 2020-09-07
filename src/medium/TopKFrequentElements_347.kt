package medium

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class TopKFrequentElements_347 {
    fun topKFrequent1(nums: IntArray, k: Int): IntArray {
        val list = mutableListOf<Node>()
        nums.forEachIndexed { index, i ->
            var haveNode: Boolean = false
            list.forEachIndexed { index, node ->
                if (i == node.value) {
                    node.frequency = node.frequency + 1
                    haveNode = true
                }
            }
            if (!haveNode) {
                list.add(Node(i, 0))
            }
        }

        val sorted = list.sortedByDescending { it.frequency }

        val result = IntArray(k)
        for (i in 0 until k) {
            result[i] = sorted[i].value!!
        }
        return result
    }

    data class Node(val value: Int? = null, var frequency: Int = 0)

    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val set = HashSet<Int>()
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, i ->
            if (set.add(i)) {
                map[i] = 0
            } else {
                val v: Int? = map[i]
                if (v != null) {
                    map[i] = v + 1
                }
            }
        }

        val list = mutableListOf<Node>()
        val result = IntArray(k)
        map.entries.forEachIndexed { index, mutableEntry ->
            list.add(Node(mutableEntry.key,mutableEntry.value))
        }

        val priorityQueue = PriorityQueue<Node>(Comparator { o1: Node, o2: Node -> return@Comparator o2.frequency - o1.frequency })

        list.forEach {
            priorityQueue.offer(it)
        }

        for (i in 0 until k) {
            result[i] = priorityQueue.poll().value!!
        }

        return result
    }


    fun exe() {
        val ints = intArrayOf(4,1,-1,2,-1,2,3)
        topKFrequent(ints, 2)
    }

}