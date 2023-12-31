/*problem link:  https://leetcode.com/problems/shuffle-the-array/description/  */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        
        int j=0;
        for(int i=0;i<ans.length-1;i+=2){
            ans[i] = nums[j++];
            ans[i+1] = nums[n++];
        }
        return ans;
    }
}