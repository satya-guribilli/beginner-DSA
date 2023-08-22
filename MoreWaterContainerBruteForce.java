/*  */
/*You are given an integer array height of length n.
 There are n vertical lines drawn such that the two 
 endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, 
such that the container contains the most water.

Return the maximum amount of water a container can store. */


//solved using bruteforce

class Solution {
    public int maxArea(int[] height) {
        int minc = Integer.MAX_VALUE;
        int maxAr  = Integer.MIN_VALUE;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                minc = Math.min(height[i],height[j]);
                int area = minc*(j-i);
                maxAr = Math.max(maxAr,area);
            }
        }
        return maxAr;
    }
}