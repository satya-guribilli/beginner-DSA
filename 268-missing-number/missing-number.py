class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        s = n*(n+1)//2
        ts = 0
        for num in nums:
            ts+=num

        return s-ts