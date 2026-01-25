class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val frequency = mutableMapOf<Int, Int>()
        nums.forEach { frequency[it] = frequency.getOrDefault(it, 0) + 1 }

        var index = 0
        frequency.forEach {
            nums[index++] = it.key
            if (it.value > 1) {
                nums[index++] = it.key
            }
        }
        return index
    }
}