package medium

import easy.LinkedListCycle_141

class LinkedListCycle_142 {

    fun detectCycle(head: ListNode?): ListNode? {

        val list = mutableListOf<ListNode>()
        var current = head
        while (current?.next != null){
            list.forEach {
                if (it == current){
                    return current
                }
            }
            list.add(current)
            current = current.next
        }
        return null
    }

    fun exe(){
        val lastest = ListNode(-4)
        val third = ListNode(0)
        val second = ListNode(2)
        val first = ListNode(3)
        first.next = second
        second.next = third
        third.next = lastest
        lastest.next = second
        
        detectCycle(first)
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}