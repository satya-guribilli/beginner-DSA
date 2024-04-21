class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # nums1.sort()
        # nums2.sort()
        # i,j = 0, 0
        # result = []
        # while i<len(nums1) and j <len(nums2):
        #     if nums1[i] < nums2[j]:
        #         i += 1
        #     elif nums1[i]>nums2[j]:
        #         j += 1
        #     else:
        #         result.append(nums1[i])
        #         i += 1
        #         j += 1
        # return result
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
