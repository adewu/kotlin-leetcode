package easy

import medium.RemoveDuplicatesSortedListII_82

class RemoveDuplicatesSortedList_83 {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if(head == null){
            return head
        }

        var cur = head

        while (cur?.next != null){
            if (cur.`val` == cur.next?.`val`){
                cur.next = cur.next?.next
            }else{
                cur = cur?.next
            }
        }

        return head
    }


    fun exe() {
        val root = ListNode(1)
        root.next = ListNode(2)
        root?.next?.next = ListNode(3)
        root?.next?.next?.next = ListNode(3)
        root?.next?.next?.next?.next = ListNode(4)
        root?.next?.next?.next?.next?.next = ListNode(4)
        root?.next?.next?.next?.next?.next?.next = ListNode(5)
        deleteDuplicates(root)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}