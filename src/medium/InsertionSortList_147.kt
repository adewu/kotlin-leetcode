package medium

import java.util.*

class InsertionSortList_147 {

    fun insertionSortList(head: ListNode?): ListNode? {
        if (head == null){
            return head
        }

        var dummyHead = ListNode(0)
        dummyHead.next = head
        var lastSorted = head
        var curr = head.next

        while (curr != null){
            if (lastSorted?.`val`!! <= curr.`val`){
                lastSorted = lastSorted.next
            }else{
                var prev = dummyHead
                while (prev.next?.`val`!! <= curr.`val`){
                    prev = prev.next!!
                }
                lastSorted.next = curr.next
                curr.next = prev.next
                prev.next = curr
            }
            curr = lastSorted?.next
        }
        return dummyHead.next
    }

    fun exe(){
        var n1 = ListNode(4)
        var n2 = ListNode(2)
        var n3 = ListNode(1)
        var n4 = ListNode(3)
        n3.next = n4
        n2.next = n3
        n1.next = n2
        insertionSortList(n1)
    }
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}