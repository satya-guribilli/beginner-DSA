/*problem link: https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article */



class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum == K) max = Math.max(max,i+1);
            if(map.containsKey(sum-K)) max = Math.max(max,i-map.get(sum-K));
            if(!map.containsKey(sum)) map.put(sum,i);
        }
        if(max == Integer.MIN_VALUE) return 0;
        
        return max;
    }
    
    
}

