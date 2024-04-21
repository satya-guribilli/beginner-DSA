class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        table = {}
        for n in nums1:
            table[n] = table.get(n,0)+1
        result= []
        for n in nums2:
            if n in table:
                if table[n]>0:
                    result.append(n)
                    table[n] = table[n]-1
        return result
