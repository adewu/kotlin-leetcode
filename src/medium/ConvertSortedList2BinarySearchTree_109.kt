package medium
class ConvertSortedList2BinarySearchTree_109{

    fun sortedListToBST(head: ListNode?): TreeNode? {

        //todo
        return null
    }

    fun exe(){
        var root = ListNode(-10)
        root.next = ListNode(-3)
        root?.next?.next = ListNode(0)
        root?.next?.next?.next = ListNode(5)
        root?.next?.next?.next?.next = ListNode(9)
        sortedListToBST(root)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    class ListNode(var `val`: Int) {
             var next: ListNode? = null
         }

}