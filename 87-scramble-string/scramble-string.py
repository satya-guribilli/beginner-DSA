class Solution:
    def isScramble(self, s1: str, s2: str) -> bool:
        @cache
        def scramble(s1_left , s1_right , s2_left, s2_right):
            if s1_left == s1_right: 
                return s1[s1_left] == s2[s2_left]
            for i in range(s1_right - s1_left):
                if scramble(s1_left , s1_left+i, s2_left , s2_left+i) and scramble(s1_left+i+1 , s1_right , s2_left+i+1 , s2_right):
                    return True
                if scramble(s1_right-i , s1_right, s2_left , s2_left+i) and scramble(s1_left , s1_right-i-1 , s2_left+i+1 , s2_right):
                    return True
            return False
        return scramble(0,len(s1)-1 , 0 , len(s1)-1)