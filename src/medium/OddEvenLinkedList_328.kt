package medium

class OddEvenLinkedList_328 {

    fun oddEvenList(head: ListNode?): ListNode? {
        if (head?.next == null) {
            return head
        }
        //head 为奇数链表头结点 o为偶数链表头结点
        var o = head
        //p为偶数链表头结点
        var p = head.next
        //e为偶数链表尾结点
        var e = p
        while (o?.next != null && e?.next != null){
            o.next = e.next
            o = o.next
            e.next = o?.next
            e = e.next
        }
        o?.next = p
        return head
    }

    fun exe() {
        var n1 = ListNode(1)
        var n2 = ListNode(2)
        var n3 = ListNode(3)
        var n4 = ListNode(4)
        var n5 = ListNode(5)
        n4.next = n5
        n3.next = n4
        n2.next = n3
        n1.next = n2
        oddEvenList(n1)

    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}