class Solution {
    public int subsetXORSum(int[] nums) {
        return subsets(nums,0,0);
    }
    public int subsets(int[] nums,int i,int curr){
        if(i>=nums.length) return curr;
        return subsets(nums,i+1,nums[i]^curr)+ subsets(nums,i+1,curr);
    }
}