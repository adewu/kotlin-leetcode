package easy

import java.util.*

class MinimumDepthOfBinaryTree_111 {

    fun minDepth_DFS(root: TreeNode?): Int {

        if (root == null) {
            return 0
        }

        if (root.left == null && root.right == null) {
            return 1
        }

        var minDepth = Integer.MAX_VALUE

        if (root.left != null) {
            minDepth = Math.min(minDepth_DFS(root.left), minDepth)
        }

        if (root.right != null) {
            minDepth = Math.min(minDepth_DFS(root.right), minDepth)
        }

        return minDepth + 1

    }

    fun minDepth_BFS(root: TreeNode?): Int {

        if (root == null) {
            return 0
        }

        val queue = LinkedList<QueueNode>()

        queue.offer(QueueNode(root, 1))

        while (!queue.isEmpty()) {
            val nodeDepth = queue.poll()
            val node = nodeDepth.node
            val depth = nodeDepth.depth
            if (node?.left == null && node?.right == null) {
                return depth
            }
            if (node.left != null) {
                queue.offer(QueueNode(node.left, depth + 1))
            }

            if (node.right != null) {
                queue.offer(QueueNode(node.right, depth + 1))
            }
        }
        return 0
    }

    data class QueueNode(val node: TreeNode?, val depth: Int)

    fun exe() {
        val p = TreeNode(3)
        val rootLChild = TreeNode(9)
        val rootRChild = TreeNode(20)


        val rootLLChild = TreeNode(15)
        val rootRRChild = TreeNode(7)
        rootRChild.left = rootLLChild
        rootRChild.right = rootRRChild

        p.left = rootLChild
        p.right = rootRChild

        print(minDepth_BFS(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}