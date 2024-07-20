class Solution:
    def isPalindrome(self, s: str) -> bool:
        a = s.lower()
        b= ""
        for char in a:
            if char.isalnum():
                b= b+char

        if(b==b[::-1]):
            return True
