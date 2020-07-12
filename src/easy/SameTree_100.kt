package easy

class SameTree_100 {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) {
            return true
        }

        if (p == null || q == null){
            return false
        }

        if (p.`val` != q.`val` ){
            return false
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right)
    }

    fun exe() {
        val p = TreeNode(5)
        val rootLChild = TreeNode(4)
        val rootRChild = TreeNode(9)
        p.left = rootLChild
        p.right = rootRChild

        val q = TreeNode(5)
        val rootLChild1 = TreeNode(4)
        val rootRChild1 = TreeNode(8)
        q.left = rootLChild1
        q.right = rootRChild1

        print(isSameTree(p, q))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}