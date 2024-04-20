class Solution:
    def mySqrt(self, x: int) -> int:
        start = 1
        end = x
        result = 0
        while start <= end:
            mid = start + (end-start) //2
            if mid*mid == x:
                result = mid
                return result
            elif mid*mid > x:
                end = mid-1
            else:
                result =mid
                start = mid+1
        return result
        