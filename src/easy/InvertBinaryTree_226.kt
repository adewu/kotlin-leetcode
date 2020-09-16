package easy

class InvertBinaryTree_226 {

    fun invertTree(root: TreeNode?): TreeNode? {
        return if (root != null){
            val temp = root.left
            root.left = root.right
            root.right = temp
            invertTree(root.left)
            invertTree(root.right)
            root
        }else{
            root
        }
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

        val invertTree = invertTree(p)
        invertTree?.`val`
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}