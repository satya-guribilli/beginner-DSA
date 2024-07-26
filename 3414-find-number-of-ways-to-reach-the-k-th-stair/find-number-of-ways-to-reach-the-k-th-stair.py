
class Solution:
    def waysToReachStair(self, k: int) -> int:
        @cache
        def dp(value, jump, prev_is_first):
            # unreachable
            if value > k + 1:
                return 0
            
            result = 0
            # reache
            if value == k:
                result += 1

            # first operation
            if value != 0 and not prev_is_first:
                result += dp(value - 1, jump, True)
            
            # second operation
            result += dp(value + 2 ** jump, jump + 1, False)

            return result
        
        return dp(1, 0, False)        