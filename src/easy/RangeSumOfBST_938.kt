package easy

class RangeSumOfBST_938 {

    var res = 0

    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        a(root,low,high)
        return res
    }

    private fun a(root: TreeNode?, low: Int, high: Int) {
        if (root == null){
            return
        }
        a(root.left, low, high)
        if (root.`val` in low..high){
            res += root.`val`
        }
        a(root.right, low, high)
    }

    fun exe(){
        val p = TreeNode(10)
        val rootLChild = TreeNode(5)
        val rootRChild = TreeNode(15)



        rootLChild.left = TreeNode(3)
        rootLChild.right = TreeNode(7)


        rootRChild.right = TreeNode(18)

        p.left = rootLChild
        p.right = rootRChild

        print(rangeSumBST(p,7,15))
    }

    class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
        }
}