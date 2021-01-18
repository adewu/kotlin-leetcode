package medium

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class AccountsMerge_721 {

    fun accountsMerge(accounts: List<List<String>>): List<List<String?>?>? {
        val emailToIndex = HashMap<String,Int>()
        val emailToName= HashMap<String,String>()
        var emailsCount = 0
        for (account in accounts) {
            val name = account[0]
            val size: Int = account.size
            for (i in 1 until size) {
                val email = account[i]
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, emailsCount++)
                    emailToName.put(email, name)
                }
            }
        }
        val uf = UnionFind(emailsCount)
        for (account in accounts) {
            val firstEmail = account[1]
            val firstIndex = emailToIndex[firstEmail]!!
            val size = account.size
            for (i in 2 until size) {
                val nextEmail = account[i]
                val nextIndex = emailToIndex[nextEmail]!!
                uf.union(firstIndex, nextIndex)
            }
        }
        val indexToEmails = HashMap<Int, MutableList<String>>()
        for (email in emailToIndex.keys) {
            val index = uf.find(emailToIndex[email]!!)
            val account = indexToEmails[index] ?: ArrayList()
            account.add(email)
            indexToEmails.put(index, account)
        }
        val merged = mutableListOf<List<String>>()
        for (emails in indexToEmails.values) {
            Collections.sort(emails)
            val name = emailToName[emails[0]]
            val account= mutableListOf<String>()
            if (name != null) {
                account.add(name)
            }
            account.addAll(emails)
            merged.add(account)
        }
        return merged
    }

    class UnionFind constructor(n: Int) {

        val parent = IntArray(n)

        init {
            for (i in 0 until n) {
                parent[i] = i
            }
        }

        fun find(index: Int): Int {
            if (parent[index] != index) {
                parent[index] = find(parent[index])
            }
            return parent[index]
        }

        fun union(index1: Int, index2: Int) {
            parent[find(index2)] = find(index1)
        }

    }

    fun exe() {
        accountsMerge(listOf(
                listOf("John", "johnsmith@mail.com", "john00@mail.com"),
                listOf("John", "johnnybravo@mail.com"),
                listOf("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                listOf("Mary", "mary@mail.com")
        )
        )
    }
}