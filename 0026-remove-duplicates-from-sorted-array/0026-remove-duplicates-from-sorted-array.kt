class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var result = 0
        nums.toSortedSet().forEachIndexed { index, num ->
            nums[index] = num
            result++
        }
        return result
    }
}