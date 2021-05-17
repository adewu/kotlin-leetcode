package easy

class CousinsInBinaryTree_993 {

    val map = HashMap<Int,Wrapper>()

    class Wrapper(val node : TreeNode,val level:Int)

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null){
            return false
        }
        a(root,root,0)
        val w1 = map[x]
        val w2 = map[y]
        if (w1 == null || w2 == null){
            return false
        }
        return w1.level == w2.level && w1.node != w2.node
    }

    private fun a(root: TreeNode,child : TreeNode,level : Int) {
        if (level != 0){
            map[child.`val`] = Wrapper(root,level)
        }
        if (child.left != null){
            a(child,child.left!!,level + 1)
        }
        if (child.right != null){
            a(child,child.right!!,level + 1)
        }
    }


    fun exe() {
        val p = TreeNode(1)
        val rootLChild = TreeNode(2)
        val rootRChild = TreeNode(3)


        val rootLRChild = TreeNode(4)
        val rootRRChild = TreeNode(5)
        rootLChild.right = rootLRChild
        rootRChild.right = rootRRChild


        p.left = rootLChild
        p.right = rootRChild

        print(isCousins(p,5,4))
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}