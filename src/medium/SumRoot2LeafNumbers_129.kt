package medium

import java.util.*

class SumRoot2LeafNumbers_129 {

    fun sumNumbers(root: TreeNode?): Int {

        return dfs(root, 0)

    }

    private fun dfs(root: TreeNode?, prevSum: Int): Int {
        if (root == null) {
            return 0
        }

        val sum = prevSum * 10 + root.`val`

        if (root.left == null && root.right == null) {
            return sum
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum)
        }
    }

    fun sumNumbersBFS(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }

        var sum = 0

        val nodeQueue = LinkedList<TreeNode>()
        val numQueue = LinkedList<Int>()
        nodeQueue.offer(root)
        numQueue.offer(root.`val`)
        while (!nodeQueue.isEmpty()) {
            val node = nodeQueue.poll()
            val num = numQueue.poll()
            val left = node.left
            val right = node.right
            if (left == null && right == null) {
                sum += sum
            } else {
                if (left != null) {
                    nodeQueue.offer(left)
                    numQueue.offer(num * 10 + left.`val`)
                }
                if (right != null) {
                    nodeQueue.offer(right)
                    numQueue.offer(num * 10 + right.`val`)
                }
            }
        }
        return sum
    }

    fun exe() {
        val root = TreeNode(4)
        val l = TreeNode(9)
        val r = TreeNode(0)

        root.left = l
        root.right = r

        root.left?.left = TreeNode(5)
        root.left?.right = TreeNode(1)

        print(sumNumbers(root))
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}