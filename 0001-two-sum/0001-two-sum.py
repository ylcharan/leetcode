class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        li = []
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if nums[i] + nums[j] == target and i != j:
                    return [i, j]
        
        