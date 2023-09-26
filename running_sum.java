/*problem link: https://leetcode.com/problems/running-sum-of-1d-array/ */


class running_sum {
    public int[] runningSum(int[] nums) {
        int n  = nums.length;
        int[] runningSum = new int[n];
        runningSum[0] = nums[0];
        for(int i=1;i<n;i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}