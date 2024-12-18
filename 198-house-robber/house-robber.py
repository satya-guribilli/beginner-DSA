class Solution:
    def rob(self, nums: List[int]) -> int:
        prevprev = 0
        prev = nums[0]

        for i in range(1,len(nums)):
            pick = nums[i]
            if i>1:
                pick += prevprev
            no_pick  = 0+prev
            cur = max(pick,no_pick)
            prevprev = prev
            prev = cur
        return prev
        