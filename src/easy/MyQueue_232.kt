package easy

import java.util.*

class MyQueue_232 {

    /** Initialize your data structure here. */
    private val queue = LinkedList<Int>()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        queue.addLast(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
     return queue.pop()
    }

    /** Get the front element. */
    fun peek(): Int {
     return queue.peek()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return queue.isEmpty()
    }
}