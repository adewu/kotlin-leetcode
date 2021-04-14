package medium

class Trie_208() {

    /** Initialize your data structure here. */
    private val children = arrayOfNulls<Trie_208>(26)
    private var isEnd = false

    /** Inserts a word into the trie. */
    fun insert(word: String) {
        var node = this
        for (i in word.indices){
            val ch = word[i]
            var index = ch - 'a'
            if (node.children[index] == null){
                node.children[index] = Trie_208()
            }
            node = node.children[index]!!
        }
        node.isEnd = true
    }

    /** Returns if the word is in the trie. */
    fun search(word: String): Boolean {
        val node = searchPrefix(word)
        return node != null && node.isEnd
    }

    private fun searchPrefix(prefix : String) : Trie_208?{
        var node = this
        for (i in prefix.indices){
            val ch = prefix[i]
            var index = ch - 'a'
            if (node.children[index] == null){
                return null
            }
            node = node.children[index]!!
        }
        return node
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    fun startsWith(prefix: String): Boolean {
        return searchPrefix(prefix) != null
    }


}