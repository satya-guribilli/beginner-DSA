class Solution(object):
    def isPalindrome(self, x):
        num = x
        div = 0 
        while(x>0):
            rem = x%10
            div = div * 10 + rem
            x = x/10
        if div==num:
            return True
        else:
            return False

        