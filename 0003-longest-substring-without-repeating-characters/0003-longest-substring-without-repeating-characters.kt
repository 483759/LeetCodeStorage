class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        
    var result = 0

    for (i in s.indices) {
        var chars = mutableSetOf(s[i])

        for (j in 1..100) {
            if (i + j == s.length || j == 100 || chars.contains(s[i + j])) {
                result = max(result, j)
                break
            }
            chars.add(s[i + j])
        }
    }

    return result
    }
}