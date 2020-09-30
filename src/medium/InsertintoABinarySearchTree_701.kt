package medium

class InsertintoABinarySearchTree_701 {

    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if (root != null){
            if (root.`val` < `val`){
               root.right = insertIntoBST(root.right,`val`)
            }else{
               root.left = insertIntoBST(root.left,`val`)
            }
            return root
        }else{
            return TreeNode(`val`)
        }
    }

    fun insertIntoBST2(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null){
            return TreeNode(`val`)
        }
        var resultRoot = root
        while (resultRoot != null){
            print(resultRoot.`val`)
            if (`val` < resultRoot.`val`){
                if (resultRoot.left == null){
                    resultRoot.left = TreeNode(`val`)
                    break
                }else{
                    resultRoot = resultRoot.left
                }
            }else{
                if (resultRoot.right == null){
                    resultRoot.right = TreeNode(`val`)
                    break
                }else{
                    resultRoot = resultRoot.right
                }
            }
        }
        return resultRoot
    }

    fun exe(){
        val p = TreeNode(4)
        val rootLChild = TreeNode(2)
        val rootRChild = TreeNode(7)
        val rootLLChild = TreeNode(1)
        val rootLRChild = TreeNode(3)
        rootLChild.left = rootLLChild
        rootLChild.right = rootLRChild
        p.right = rootRChild
        p.left = rootLChild
        var root = insertIntoBST2(p, 5)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}