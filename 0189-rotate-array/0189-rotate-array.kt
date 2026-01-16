class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val temp = MutableList(nums.size) { 0 }
        for (index in nums.indices) {
            temp[index] = nums[(index + nums.size - (k % nums.size)) % nums.size]
        }
        for (index in temp.indices) {
            nums[index] = temp[index]
        }
    }
}