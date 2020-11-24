package medium

import easy.InvertBinaryTree_226
import java.util.*

class CountCompleteTreeNodes_222 {

    fun countNodes(root: TreeNode?): Int {
        val queue = LinkedList<Int>()
        return r(root,queue)
    }

    fun r(root: TreeNode?,queue : LinkedList<Int>) : Int{
        if (root != null){
            queue.offer(root.`val`)
            r(root.left,queue)
            r(root.right,queue)
        }
        return queue.size
    }

    fun exe() {
        val p = TreeNode(4)
        val rootLChild = TreeNode(2)
        val rootRChild = TreeNode(7)


        val rootLLChild = TreeNode(1)
        val rootLRChild = TreeNode(3)

        val rootRLChild = TreeNode(6)
        val rootRRChild = TreeNode(9)

        rootLChild.left = rootLLChild
        rootLChild.right = rootLRChild

        rootRChild.left = rootRLChild
        rootRChild.right = rootRRChild

        p.left = rootLChild
        p.right = rootRChild

        print(countNodes(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}