class Solution(object):
    def removeDuplicates(self, nums):
        exists = set()
        results = []
        for i in nums:
            if i not in results:
                exists.add(i)
                results+=[i]

        nums[:] = results[:]
        
        return len(nums)
        