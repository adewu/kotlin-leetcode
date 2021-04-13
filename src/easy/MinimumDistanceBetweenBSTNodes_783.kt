package easy

class MinimumDistanceBetweenBSTNodes_783 {

    var pre = -1
    var ans = Integer.MAX_VALUE

    fun minDiffInBST(root: TreeNode?): Int {
        ans = Integer.MAX_VALUE
        dfs(root)
        return ans
    }

    private fun dfs(root: TreeNode?) {
        if (root == null) {
            return
        }
        dfs(root.left)
        if (pre == -1) {
            pre = root.`val`
        } else {
            ans = Math.min(ans, root.`val` - pre)
            pre = root.`val`
        }
        dfs(root.right)
    }


    fun exe() {
        val p = TreeNode(4)
        val rootLChild = TreeNode(2)
        val rootRChild = TreeNode(6)
        p.left = rootLChild
        p.right = rootRChild

        val rootLChild1 = TreeNode(1)
        val rootRChild1 = TreeNode(3)

        p.left?.left = rootLChild1
        p.left?.right = rootRChild1

        print(minDiffInBST(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

}