/*Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
 
Problem link:https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

*/

class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int q = nums[i]+k;
            int q1 = nums[i]-k;
            if(map.containsKey(q)) count+=map.getOrDefault(q,0);
            if(map.containsKey(q1)) count+=map.getOrDefault(q1,0);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
