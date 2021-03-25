package medium

class RemoveDuplicatesSortedListII_82 {

    // 1 2 3
    fun deleteDuplicates(head: ListNode?): ListNode? {

      if (head == null){
          return head
      }

        var dummy = ListNode(0)
        dummy.next = head
        var cur = dummy

        while (cur.next != null && cur?.next?.next != null){
            if (cur.next?.`val` == cur.next?.next?.`val`){
                val x = cur.next?.`val`
                while (cur.next != null && cur.next?.`val` == x){
                    cur.next = cur.next?.next
                }
            }else{
                cur = cur?.next!!
            }
        }

        return dummy.next
    }

    // 1 2 3 3 4 4 5
    fun exe(){
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