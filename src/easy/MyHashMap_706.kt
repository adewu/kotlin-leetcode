package easy

import java.util.*
import kotlin.collections.HashMap

class MyHashMap_706() {
    /** Initialize your data structure here. */
    private val BASE = 769
    private val data = arrayOfNulls<LinkedList<Pair>>(BASE)

    init {
        for (i in 0 until BASE){
            data[i] = LinkedList<Pair>()
        }
    }

    /** value will always be non-negative. */
    fun put(key: Int, value: Int) {
        val h = hash(key)
        val linkedList = data[h]
        linkedList?.apply {
            while (iterator().hasNext()){
                val pair = iterator().next()
                if (pair.key == key){
                    pair.value = value
                    return
                }
            }
        }

        data[h]!!.offerLast(Pair(key,value))

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        val h = hash(key)
        val iterator = data[h]!!.iterator()
        while (iterator.hasNext()){
            val pair = iterator.next()
            if (pair.key == key){
                return pair.value
            }
        }

        return -1
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
        val h = hash(key)
        val iterator = data[h]!!.iterator()
        while (iterator.hasNext()){
            val pair = iterator.next()
            if (pair.key == key){
                data[h]!!.remove(pair)
                return
            }
        }
    }

    companion object{
        fun hash(key :Int) :Int{
            return key % 769
        }
    }



    class Pair(var key :Int,var value :Int)
}