package medium

import java.util.*

class Graph {
    private var V = 0
    private var adj = LinkedList<LinkedList<Int>>()

    constructor(v : Int){
        V = v
        for (i in 0 until v){
            adj.add(LinkedList<Int>())
        }
    }

    fun addEdge(v : Int ,w : Int){
        adj[v].add(w)
    }

    fun bfs(s : Int){
        val visited = BooleanArray(V)
        val queue = LinkedList<Int>()
        visited[s] = true
        queue.add(s)
        while (queue.size != 0){
            val s = queue.poll()
            print(s)
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            val listIterator = adj[s].listIterator()
            while (listIterator.hasNext()){
                val next = listIterator.next()
                if (!visited[next]){
                    visited[next] = true
                    queue.add(next)
                }
            }
        }

    }
}