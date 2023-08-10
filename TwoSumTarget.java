//find the pair of elements whose elements sum is equal to the target given



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array1 = new int[2];
    
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array1[0] = i;
                    array1[1] = j;
                }
            }
        }
        Arrays.sort(array1);
        return array1;
    }
}