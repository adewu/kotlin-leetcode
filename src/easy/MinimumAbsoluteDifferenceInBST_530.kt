package easy

class MinimumAbsoluteDifferenceInBST_530 {

    var pre = -1
    var ans = 0

    fun getMinimumDifference(root: TreeNode?): Int {
       ans = Integer.MAX_VALUE
        dfs(root)
        return ans
    }

    private fun dfs(root: TreeNode?) {
        if (root == null){
            return
        }
        dfs(root.left)
        if (pre == -1){
            pre = root.`val`
        }else{
            ans = Math.min(ans,root.`val` - pre)
            pre = root.`val`
        }
        dfs(root.right)
    }

    fun exe() {
        val p = TreeNode(1)
        val rootRChild = TreeNode(3)

        val rootLLChild = TreeNode(2)
        rootRChild.left = rootLLChild

        p.right = rootRChild

        print(getMinimumDifference(p))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}