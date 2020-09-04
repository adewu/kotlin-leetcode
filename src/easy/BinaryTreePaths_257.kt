package easy

import java.lang.StringBuilder

class BinaryTreePaths_257 {

    fun binaryTreePaths(root: TreeNode?): List<String> {
        val resultList = mutableListOf<String>()
        buildPath(root,"",resultList)
        return resultList

    }

    private fun buildPath(root: TreeNode?, path: String, paths: MutableList<String>) {
        if (root != null){
            val sb = StringBuffer(path)
            sb.append(root.`val`.toString())
            if (root.left == null && root.right == null){
                paths.add(sb.toString())
            }else{
                sb.append("->")
                buildPath(root.left,sb.toString(),paths)
                buildPath(root.right,sb.toString(),paths)
            }
        }
    }
    
    fun exe(){
        val p = TreeNode(1)
        val rootLChild = TreeNode(2)
        val rootRChild = TreeNode(3)


        val rootRRChild = TreeNode(5)
        rootRChild.right = rootRRChild

        p.left = rootLChild
        p.right = rootRChild
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}