/* problem link Arrays easy difficulty problem: 
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/ */



class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> ls = new ArrayList<>();
        int n = candies.length;
        for(int i=0;i<n;i++){
            max = Math.max(max,candies[i]);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                ls.add(true);
            }
            else ls.add(false);
        }
        return ls;
    }
}

