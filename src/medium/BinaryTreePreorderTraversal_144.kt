package medium

class BinaryTreePreorderTraversal_144 {

    fun preorderTraversal(root: TreeNode?): List<Int> {
        val list = mutableListOf<Int>()
        rec(root,list)
        return list
    }

    private fun rec(root: TreeNode?, list: MutableList<Int>) {
        if (root != null){
            list.add(root.`val`)
            rec(root.left,list)
            rec(root.right,list)
        }
    }

    fun exe() {
        val three = TreeNode(3)
        val two = TreeNode(2)
        val one = TreeNode(1)
        two.left = three
        one.right = two

        val preorderTraversal = preorderTraversal(one)
        preorderTraversal.forEach { print(it) }
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}