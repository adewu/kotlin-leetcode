package medium
class ConvertSortedList2BinarySearchTree_109{

    fun sortedListToBST(head: ListNode?): TreeNode? {
        if(head == null){
            return null
        }
        var slow = head
        var fast = head
        var preSlow : ListNode ?= null
        while (fast != null && fast.next != null){ //快慢指针
            preSlow = slow
            slow = slow?.next
            fast = fast.next?.next
        }
        var root = TreeNode(slow!!.`val`)

        if (preSlow != null){
            preSlow.next = null
            root.left = sortedListToBST(head)
        }
        root.right = sortedListToBST(slow.next)
        return root
    }
    // -10 -3 0 5 9
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