class Solution {
    fun longestPalindrome(s: String): String {
    for (i in s.length downTo 0) {
        for (j in 0..s.length - i)
            if (s.substring(j, j + i) == s.substring(j, j + i).reversed()) return s.substring(j, j + i)
    }

    return s[0].toString()
    }
}