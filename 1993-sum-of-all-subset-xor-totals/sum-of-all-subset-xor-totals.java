class Solution {
    public int subsetXORSum(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor |= nums[i];
        }
        return xor*(int)(Math.pow(2,(nums.length-1)));
    }
}