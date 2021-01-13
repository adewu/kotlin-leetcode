package medium

class RedundantConnection_684 {

    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val nodeCount = edges.size
        val parent = IntArray(nodeCount + 1)
        for (i in 1 ..nodeCount){
            parent[i] = i
        }
        for (i in 0 until nodeCount){
            val edge = edges[i]
            val node1 = edge[0]
            val node2 = edge[1]
            if (find(parent,node1) != find(parent,node2)){
                union(parent,node1,node2)
            }else{
                return edge
            }
        }
        return intArrayOf(0)
    }

    private fun find(parent: IntArray,index: Int) : Int{
        if (parent[index] != index){
            parent[index] = find(parent,parent[index])
        }
        return parent[index]
    }

    private fun union(parent: IntArray, node1: Int, node2: Int) {
        parent[find(parent,node1)] = find(parent,node2)
    }

    fun exe(){
        findRedundantConnection(arrayOf(intArrayOf(1,2),intArrayOf(2,3),intArrayOf(3,4),intArrayOf(1,4),intArrayOf(1,5)))
    }
}