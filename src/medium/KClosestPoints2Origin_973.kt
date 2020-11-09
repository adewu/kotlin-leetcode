package medium

import java.util.*
import kotlin.Comparator

class KClosestPoints2Origin_973 {

    fun kClosest(points: Array<IntArray>, K: Int): Array<IntArray> {
        val priorityQueue = PriorityQueue<Entity>(Comparator { o1: Entity, o2: Entity ->
            if (o1.d!! < o2!!.d!!){
                return@Comparator -1
            }else{
                return@Comparator 1
            }
        })
        points.forEachIndexed { index, ints ->
            val d = Math.sqrt(Math.pow(ints[0].toDouble(), 2.0) + Math.pow(ints[1].toDouble(), 2.0))
            val entity = Entity()
            entity.d = d
            entity.arr = ints
            priorityQueue.offer(entity)
        }

        val resultArray = Array(K){
            intArrayOf()
        }
        for (i in 0 until K) {
            if (priorityQueue.isNotEmpty()) {
                val entity = priorityQueue.poll()
                if (entity != null) {
                    resultArray[i] = entity?.arr!!
                }
            }
        }
        return resultArray
    }

    class Entity{
        var d : Double ?= null
        var arr : IntArray ?= null
    }

    fun exe() {
        val intArray1 = intArrayOf(1, 3)
        val intArray2 = intArrayOf(-2, 2)
        val array = arrayOf(intArray1, intArray2)
        kClosest(array, 1)
    }
}