package medium

import java.lang.StringBuilder
import java.util.*
import kotlin.collections.HashMap

class SmallestStringWithSwaps_1202 {

    fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String {
        if (pairs.isEmpty()){
            return s
        }

        // 第 1 步：将任意交换的结点对输入并查集
        val len = s.length
        val unionFind  = UnionFind(len)
        pairs.forEach {
            val index1 = it[0]
            val index2 = it[1]
            unionFind.union(index1,index2)
        }

        // 第 2 步：构建映射关系
        val charArray = s.toCharArray()
        // key：连通分量的代表元，value：同一个连通分量的字符集合（保存在一个优先队列中）
        val hashMap : HashMap<Int,PriorityQueue<Char>> = HashMap(len)
        for (i in 0 until len){
            val root = unionFind.find(i)
            if (hashMap.containsKey(root)){
                hashMap[root]?.offer(charArray[i])
            }else{
                val minHeap = PriorityQueue<Char>()
                minHeap.offer(charArray[i])
                hashMap[root] = minHeap
            }
        }

        // 第 3 步：重组字符串
        val sb = StringBuilder()
        for (i in 0 until len){
            val root = unionFind.find(i)
            sb.append(hashMap[root]?.poll())
        }

        return sb.toString()
    }

    class UnionFind constructor(n : Int){
        private var parent : IntArray = IntArray(n)
        private var rank : IntArray = IntArray(n)

        init {
            for (i in 0 until n){
                parent[i] = i
                rank[i] = i
            }
        }

        fun find(x : Int) : Int{
            if (parent[x] != x){
                parent[x] = find(parent[x])
            }
            return parent[x]
        }

        fun union(x : Int,y : Int) {
            val rootX = find(x)
            val rootY = find(y)
            if (rootX == rootY){
                return
            }
            if (rank[rootX] == rank[rootY]){
                parent[rootX] = rootY
                rank[rootY] ++
            }else if (rank[rootX] < rank[rootY]){
                parent[rootX] = rootY
            }else{
                parent[rootY] = rootX
            }
        }
    }


    fun exe(){
        smallestStringWithSwaps("dcab", listOf(listOf(0,3),listOf(1,2)))
    }

}