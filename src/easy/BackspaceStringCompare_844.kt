package easy

import java.util.*

class BackspaceStringCompare_844 {

    fun backspaceCompare(S: String, T: String): Boolean {

        val sArray = S.toCharArray()
        val tArray = T.toCharArray()
        val sStack = LinkedList<Char>()
        val tStack = LinkedList<Char>()

        for (c in sArray) {
            if (c != '#') {
                sStack.push(c)
            } else if (!sStack.isEmpty()) {
                sStack.pop()
            }
        }

        for (c in tArray) {
            if (c != '#') {
                tStack.push(c)
            } else if (!tStack.isEmpty()) {
                tStack.pop()
            }
        }

        if (sStack.size != tStack.size){
            return false
        }

        sStack.forEachIndexed { index, c ->
            if (tStack.size > index) {
                if (tStack[index] != c) {
                    return false
                }
            }
        }

        return true
    }


    fun exe() {
        backspaceCompare("bxj##tw",
                "bxj###tw")
    }

}