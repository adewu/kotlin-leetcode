package easy

class ConvertSortedArray2BinarySearchTree_108 {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return dfs(nums,0,nums.size -1)
    }

    private fun dfs(nums: IntArray, lo: Int, hi: Int): TreeNode? {
        if (lo > hi){
            return null
        }
        val mid = lo + (hi - lo) / 2
        val root = TreeNode(nums[mid])
        root.left = dfs(nums,lo,mid - 1)
        root.right = dfs(nums,mid + 1,hi)
        return root
    }

    fun exe(){
        val node = sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
        print(node?.`val`)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}