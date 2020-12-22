package medium

import easy.MaximumDepthOfBinaryTree_104
import java.util.*

class BTZigzagLevelOrderTraversal_103 {

    fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {

        val res = mutableListOf<MutableList<Int>>()
        val queue = LinkedList<TreeNode>()
        if (root == null){
            return res
        }
        if (root != null){
            queue.offer(root)
        }
        var isOrderLeft = true

        while (queue.isNotEmpty()){
            val levelList = LinkedList<Int>()
            val size = queue.size
            for (i in 0 until size){
                val curNode = queue.poll()
                if (isOrderLeft){
                    levelList.offerLast(curNode.`val`)
                }else{
                    levelList.offerFirst(curNode.`val`)
                }
                if (curNode.left != null){
                    queue.offer(curNode.left)
                }
                if (curNode.right != null){
                    queue.offer(curNode.right)
                }
            }

            res.add(levelList)
            isOrderLeft = !isOrderLeft
        }
        return res
    }

    fun exe(){
        val p = TreeNode(3)
        val rootLChild = TreeNode(9)
        val rootRChild = TreeNode(20)


        val rootLLChild = TreeNode(15)
        val rootRRChild = TreeNode(7)
        rootRChild.left = rootLLChild
        rootRChild.right = rootRRChild

        p.left = rootLChild
        p.right = rootRChild

        zigzagLevelOrder(p)
    }

     class TreeNode(var `val`: Int) {
             var left: TreeNode? = null
             var right: TreeNode? = null
         }
}