package easy

class FindModeInBinarySearchTree_501 {

    fun findMode(root: TreeNode?): IntArray {
        val map = HashMap<Int, Int>();
        addElementIntoMap(root, map)
        var maxIndex = 0
        for (mutableEntry in map) {
            if (mutableEntry.value > maxIndex){
                maxIndex = mutableEntry.value
            }
        }
        val mutableListOf = mutableListOf<Int>()
        for (mutableEntry in map) {
            if (mutableEntry.value == maxIndex){
                mutableListOf.add(mutableEntry.key)
            }
        }
        return mutableListOf.toIntArray()
    }

    private fun addElementIntoMap(root: TreeNode?, map: HashMap<Int, Int>) {
        if (root != null) {
            var times = map[root.`val`]
            if (times != null) {
                map[root.`val`] = times + 1

            }else{
                map[root.`val`] = 0
            }
            addElementIntoMap(root.left, map)
            addElementIntoMap(root.right, map)
        }
    }

    fun exe() {
        val p = TreeNode(1)
        val rootRChild = TreeNode(2)
        val rootRRChild = TreeNode(2)
        rootRChild.right = rootRRChild
        p.right = rootRChild
        val findMode = findMode(p)
        findMode.forEach {
            print(it)
        }
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}