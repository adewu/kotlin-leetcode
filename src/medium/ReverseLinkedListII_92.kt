package medium

import easy.LinkedListCycle_141

class ReverseLinkedListII_92 {

    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val dummyNode = ListNode(-1)
        dummyNode.next = head
        var pre = dummyNode
        for (i in 0 until left - 1){
            pre = pre.next!!
        }
        var cur = pre.next
        var next : ListNode ?= null
        for (i in 0 until right - left){
            next = cur?.next 
            cur?.next = next?.next
            next?.next = pre?.next
            pre.next = next
        }

        return dummyNode.next
    }


    
    fun exe(){
        val lastest1 = ListNode(5)
        val lastest = ListNode(4)
        val third = ListNode(3)
        val second = ListNode(2)
        val first = ListNode(1)
        first.next = second
        second.next = third
        third.next = lastest
        lastest.next = lastest1
        reverseBetween(first,2,4)
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}