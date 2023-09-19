/*problem link: https://leetcode.com/problems/build-array-from-permutation/ */

class Solution {
    public int[] buildArray(int[] nums) {
        int ans2[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans2[i] = nums[nums[i]];
        }
        return ans2;
    }
}