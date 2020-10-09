package easy

class LinkedListCycle_141 {

    fun hasCycle(head: ListNode?): Boolean {

        var slow = head
        var fast = head

        while (fast != null){
            fast = fast.next
            if (fast != null){
                fast = fast.next
            }
            if (slow == fast){
                return true
            }
            slow = slow?.next
        }
        return false
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

        hasCycle(first)
    }

     class ListNode(var `val`: Int) {
           var next: ListNode? = null
         }
}