package medium

class MostStonesRemovedSameRowColumn_947 {

    private val unionFind = UnionFind()

    fun removeStones(stones: Array<IntArray>): Int {
        stones.forEachIndexed { index, ints ->
            unionFind.union(ints[0] + 10001,ints[1])
        }
        return stones.size - unionFind.count
    }

    private class UnionFind{
        val parent = HashMap<Int,Int>()
        var count = 0

        fun find(x : Int) : Int{
            if (!parent.containsKey(x)){
                parent[x] = x
                count++
            }
            if (x != parent[x]){
                parent[x] = find(parent[x]!!)
            }
            return parent[x] ?: 0
        }

        fun union(x : Int,y : Int){
            val rootX = find(x)
            val rootY = find(y)
            if (rootX == rootY){
                return
            }

            parent[rootX] = rootY
            count--
        }

    }

    fun exe(){
        removeStones(arrayOf(intArrayOf(0,0),intArrayOf(0,1),intArrayOf(1,0),intArrayOf(1,2),intArrayOf(2,1),intArrayOf(2,2)))
    }
}