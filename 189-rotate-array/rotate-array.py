class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k = k % len(nums)
        s = len(nums)-k
        new = nums[0:s]

        nums[0:s] = []

        nums.extend(new)