package easy

class PathSum_112 {

    fun hasPathSum(root: TreeNode?, sum: Int): Boolean {
        if (root == null){
            return false
        }

        if (root.left == null && root.right == null){
            return root.`val` == sum
        }

        return hasPathSum(root.left,sum - root.`val`) || hasPathSum(root.right,sum - root.`val`)
    }



    /**
     *
     5
    /  \
    4   8
    /   / \
    11  13  4
    / \      \
    7  2      1
     *
     *
     *
     */
    fun exe(){
        val root = TreeNode(5)
        val rootLChild = TreeNode(4)
        val rootRChild = TreeNode(8)

        val rootLLChild = TreeNode(11)

        val rootRLChild = TreeNode(13)
        val rootRRChild = TreeNode(4)

        val rootLLLChild = TreeNode(7)
        val rootLLRChild = TreeNode(2)

        val rootRRRChild = TreeNode(1)


        rootLLChild.left = rootLLLChild
        rootLLChild.right = rootLLRChild

        rootRRChild.right = rootRRRChild

        rootRChild.left = rootRLChild
        rootRChild.right = rootRRChild

        rootLChild.left = rootLLChild

        root.left = rootLChild
        root.right = rootRChild



        print(hasPathSum(root,22))
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}