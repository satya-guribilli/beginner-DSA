class Solution:
    def longestPalindrome(self, s: str) -> str:
        def checkpal(i,j,st):
            while i>=0 and j<len(st) and st[i] == st[j]:
                i-=1
                j+=1
            return st[i+1:j]
        res = ""

        for i in range(len(s)):
            sub1 = checkpal(i,i,s)
            if len(sub1)>len(res):
                res = sub1
            sub2 = checkpal(i,i+1,s)
            if len(sub2)>len(res):
                res =sub2
        return res