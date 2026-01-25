class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var i = 2
        for (j in 2 until nums.size)
            if (nums[j] != nums[i - 2]) {
                nums[i++] = nums[j]
            }
        return i
    }
}