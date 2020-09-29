package medium

class BinaryTreePostorderTraversal_145 {

    fun postorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        r(root,list)
        return list
    }

    private fun r(root: TreeNode?, list: MutableList<Int>) {
        if (root != null) {
            r(root?.left, list)
            r(root?.right, list)
            list.add(root.`val`)
        }
    }

    fun exe(){
        val p = TreeNode(1)
        val rootRChild = TreeNode(2)
        val rootRLChild = TreeNode(3)
        rootRChild.left = rootRLChild
        p.right = rootRChild
        p.left = null
        postorderTraversal(p)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}