package medium

import java.util.*

class NumberOperationsMakeNetworkConn_1319 {

    fun makeConnected(n: Int, connections: Array<IntArray>): Int {

        if(connections.size < n - 1){
            return -1
        }

        val uf = UnionFind(n)
        connections.forEachIndexed { index, ints ->
            uf.union(ints[0],ints[1])
        }

        return uf.setCount - 1
    }

    private class UnionFind constructor(n : Int){

        private val parent = IntArray(n)
        private val size = IntArray(n){1}
        var setCount = n

        init {
           for (i in 0 until n){
               parent[i] = i
           }
        }

        fun find(index : Int) : Int{
            if (parent[index] != index){
                parent[index] = find(parent[index])
            }
            return parent[index]
        }

        fun union(index1 : Int, index2: Int) : Boolean{
            var x = find(index1)
            var y = find(index2)
            if (x == y){
                return false
            }

            if (size[x] < size[y]){
                val temp = x
                x = y
                y = temp
            }

            parent[y] = x
            size[x] += size[y]
            --setCount
            return true

        }

        fun connected(index1 : Int, index2: Int) : Boolean{
            var x = find(index1)
            var y = find(index2)
            return x == y
        }

    }

    fun exe(){
        makeConnected(4, arrayOf(intArrayOf(0,1), intArrayOf(0,2), intArrayOf(1,2)))
    }
}