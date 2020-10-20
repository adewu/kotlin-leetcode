package medium

import java.util.*

class ReorderList_143 {

    fun reorderList(head: ListNode?): Unit {
        if (head == null){
            return
        }
        val stack = LinkedList<ListNode>()
        var current = head
        while (current != null){
            stack.push(current)
            current = current?.next
        }
        val resultFirstNode = stack.pollLast()
        resultFirstNode.next = null
        while (stack.size != 0){
            val pollFirst = stack.pollFirst()
            pollFirst.next = null
            push(resultFirstNode,pollFirst)
            if (stack.size != 0){
                val pollLast = stack.pollLast()
                pollLast.next = null
                push(resultFirstNode,pollLast)
            }
        }
    }

    fun push(head : ListNode,node : ListNode){
        var tempNode : ListNode = head
        while (true){
            if (tempNode.next == null){
                tempNode.next = node
                break
            }else{
                tempNode = tempNode.next!!
            }
        }
    }

    fun exe(){
        val listNode1 = ListNode(1)
        val listNode2 = ListNode(2)
        val listNode3 = ListNode(3)
        val listNode4 = ListNode(4)
        listNode3.next = listNode4
        listNode2.next = listNode3
        listNode1.next = listNode2
        reorderList(listNode1)
    }

    class ListNode(var `val`: Int) {
             var next: ListNode? = null
         }
}