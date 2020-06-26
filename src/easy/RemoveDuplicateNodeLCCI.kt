package easy

class RemoveDuplicateNodeLCCI {

    fun removeDuplicateNodes(head: ListNode?): ListNode? {
        if (head == null) {
            return head
        }
        val set = HashSet<Int>()
        set.add(head.`val`)
        var pos = head
        while (pos!!.next != null) {
            val cur = pos.next
            if (set.add(cur!!.`val`)) {
                pos = pos.next
            } else {
                pos.next = pos.next?.next
            }
        }
        pos.next = null
        return head
    }

    fun exe() {
        //1, 2, 3, 3, 2, 1
        val node1 = ListNode(1)
        val node2 = ListNode(2)
        val node3 = ListNode(3)
        val node4 = ListNode(2)
        val node5 = ListNode(1)
        node1.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5

        removeDuplicateNodes(node1)
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}