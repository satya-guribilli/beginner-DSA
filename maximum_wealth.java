/* problem link:   https://leetcode.com/problems/richest-customer-wealth/ */


class Solution {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int c = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            int sum = 0;
            for(int j=0;j<c;j++){
               sum += accounts[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}