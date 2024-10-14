class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxi = float('-inf')
        n = len(nums)
        prod1, prod2 = nums[0],nums[0]
        res = nums[0]

        for i in range(1,n):
            temp = max(nums[i], prod1*nums[i], prod2*nums[i])
            prod2 = min(nums[i],prod1*nums[i], prod2*nums[i])
            prod1 = temp
            res = max(res, prod1)
        return res

        
        