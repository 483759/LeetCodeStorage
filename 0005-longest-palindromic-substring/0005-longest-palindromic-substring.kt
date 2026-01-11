class Solution {
    fun longestPalindrome(s: String): String {
        
    var result: Pair<String, Int> = s[0].toString() to 1

    for (i in s.indices) {
        for (j in result.second..s.length) {
            if (i + j > s.length) break
            val substring = s.substring(i, i + j)
            if (substring.reversed() == substring) {
                result = if (j > result.second) substring to j else result
            }
        }
    }
    return result.first
    }
}