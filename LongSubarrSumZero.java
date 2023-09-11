/*Problem : longest subarray sum equals to 0;
Problem link:   https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
*/Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
 
Problem link:https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/



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


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int max = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum==0){
                max = i+1;
            }
            Integer pref = hmap.get(sum);
            
            if(pref!=null){
                max = Math.max(max,i-pref);
            }
            else{
                hmap.put(sum,i);
            }
        }
    
        return max;
    }
}
