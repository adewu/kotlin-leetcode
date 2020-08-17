package easy

class BalancedBinaryTree_110 {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null){
            return true
        }else{
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right)
        }
    }

    fun height(root : TreeNode?) : Int{
        if (root == null){
            return 0
        }else{
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }

    fun exe() {
        val p = TreeNode(5)
        val rootLChild = TreeNode(4)
        val rootRChild =TreeNode(9)


        val rootLLChild = TreeNode(4)
        val rootRRChild =TreeNode(9)
        rootRChild.left = rootLLChild
        rootRChild.right = rootRRChild


        p.left = rootLChild
        p.right = rootRChild

        print(isBalanced(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}