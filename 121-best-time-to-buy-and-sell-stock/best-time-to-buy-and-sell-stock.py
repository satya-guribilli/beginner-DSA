class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans = 0
        minimum = prices[0]
        for i in range(1 , len(prices)):
            currentprofit = prices[i]-minimum
            if(currentprofit>ans):
                ans = currentprofit
            minimum = min(minimum,prices[i])
        return ans