package easy

import java.util.*

class LastStoneWeight_1046 {

    fun lastStoneWeight1(stones: IntArray): Int {
        val arr = stones.copyOf(30)
        arr.sort()
        while (hasMoreThanOneNum(arr)){
            if (arr[29] > 0 && arr[28] > 0) {
                val i = arr[29] - arr[28]
                if (i == 0) {
                    arr[29] = 0
                    arr[28] = 0
                } else {
                    arr[29] = 0
                    arr[28] = i
                }
                arr.sort()
            }
        }

        return arr[29]
    }

    fun hasMoreThanOneNum(arr : IntArray) : Boolean{
        var count  = 0
        arr.forEach {
            if (it > 0){
                count ++
            }

        }
        return count > 1
    }


    fun lastStoneWeight(stones: IntArray): Int {
        val pq = PriorityQueue<Int>(kotlin.Comparator { o1, o2 ->
            o2 - o1
        })

        stones.forEach {
            pq.offer(it)
        }

        while (pq.size > 1){
                val i = pq.poll() - pq.poll()
                if (i == 0){
                    if (pq.isEmpty()){
                        return 0
                    }
                }else{
                    pq.offer(i)
                }
        }

        return pq.poll()
    }

    fun exe(){
        lastStoneWeight(intArrayOf(2,7,4,1,8,1))
    }
}