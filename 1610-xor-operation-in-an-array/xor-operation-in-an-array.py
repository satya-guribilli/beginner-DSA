class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        # nums = [start + (2*i) for i in range(n)]
        
        nums = {}
        for i in range(0,n):
            nums[i] = start + (2*i)
        xor = nums[0]
        for j in range(1,n):
            xor ^= nums[j]
        return xor