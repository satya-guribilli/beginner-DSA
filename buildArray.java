/*problem link: https://leetcode.com/problems/build-array-from-permutation/ */

class buildArray {
    public int[] build_Array(int[] nums) {
        int ans2[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans2[i] = nums[nums[i]];
        }
        return ans2;
    }
}