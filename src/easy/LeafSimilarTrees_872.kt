package easy

import java.util.*

class LeafSimilarTrees_872 {

    val root1List = mutableListOf<Int>()
    val root2List = mutableListOf<Int>()

    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        addVal(root1,root1List)
        addVal(root2,root2List)
        if (root1List.size != root2List.size){
            return false
        }

        for (i in root1List.indices){
            if (root1List[i] != root2List[i]){
                return false
            }
        }

        return true
    }

    fun addVal(root1: TreeNode?, root1List: MutableList<Int>){
        if (root1 == null){
            return
        }
        if (root1.left == null && root1.right == null){
            root1List.add(root1.`val`)
        }
        addVal(root1.left,root1List)
        addVal(root1.right,root1List)
    }


     class TreeNode(var `val`: Int) {
             var left: TreeNode? = null
             var right: TreeNode? = null
         }
}