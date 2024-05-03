class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int no_of_ones;
        int no_of_zeroes;
        for(int i=0;i<32;i++){
            no_of_ones = 0;
            no_of_zeroes =  0;
            for(int num : nums ){
                if((num & (1<<i))==0){
                    no_of_zeroes++;
                }
                else{
                    no_of_ones++;
                }
            }
            if(no_of_ones%3 != 0){
                ans |= 1<<i;
            }
            
            
        }
        return ans;
    }
}