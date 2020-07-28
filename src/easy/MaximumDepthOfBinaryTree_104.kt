package easy

class MaximumDepthOfBinaryTree_104 {

    fun maxDepth(root: TreeNode?): Int {
        if (root == null){
            return 0
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1
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

        print(maxDepth(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}