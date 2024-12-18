class Solution:
    def solve(self,arr):
        prevprev = 0
        prev = arr[0]
        n = len(arr)
        for i in range(1,n):
            pick  =  arr[i]

            if i>1:
                pick += prevprev
            no_pick = 0+prev
            cur = max(pick,no_pick)
            prevprev = prev
            prev = cur
        return prev
    def rob(self, nums: List[int]) -> int:
        arr1 = []
        arr2 =  []
        n = len(nums)
        if n==1:
            return nums[0]
        for i in range(n):
            if i!=0:
                arr1.append(nums[i])
            if i!=n-1:
                arr2.append(nums[i])

        sol1 = self.solve(arr1)
        sol2 = self.solve(arr2)

        return max(sol1,sol2)

    
        