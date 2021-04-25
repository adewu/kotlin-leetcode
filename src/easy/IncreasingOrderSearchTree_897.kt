package easy

class IncreasingOrderSearchTree_897 {

    var resNode: TreeNode? = null

    fun increasingBST(root: TreeNode?): TreeNode? {
        val dummyNode = TreeNode(-1)
        resNode = dummyNode
        a(root)
        return dummyNode.right
    }

    fun a(root: TreeNode?) {
        if (root == null) {
            return
        }
        a(root.left)
        resNode?.right = root
        root.left = null
        resNode = root
        a(root.right)
    }


    fun exe() {
        val p = TreeNode(5)
        val rootLChild = TreeNode(3)
        val rootRChild = TreeNode(6)


        val rootLLChild = TreeNode(2)
        val rootLRChild = TreeNode(4)

        val rootRLChild = TreeNode(5)
        val rootRRChild = TreeNode(7)

        rootLChild.left = rootLLChild
        rootLChild.right = rootLRChild

        rootRChild.left = rootRLChild
        rootRChild.right = rootRRChild

        p.left = rootLChild
        p.right = rootRChild
        increasingBST(p)
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}