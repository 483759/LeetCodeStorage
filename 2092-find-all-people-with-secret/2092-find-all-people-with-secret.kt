class Solution {
    fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
        val knows = BooleanArray(n)
        knows[0] = true
        knows[firstPerson] = true
        
        val sorted = meetings.sortedBy { it[2] }
        
        for (m in sorted) {
            val u = m[0]
            val v = m[1]
            if (knows[u] || knows[v]) {
                knows[u] = true
                knows[v] = true
            }
        }
        
        val result = mutableListOf<Int>()
        for (i in 0 until n) {
            if (knows[i]) result.add(i)
        }
        return result
    }
}