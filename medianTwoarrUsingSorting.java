

//find the median of two sorted arrays ... you can use sorting 


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n3 = nums1.length+nums2.length;
        int[] nums3 = new int[n3];
        int n1 = nums1.length;
        int n2 = nums2.length;
        System.arraycopy(nums1,0,nums3,0,n1);
        System.arraycopy(nums2,0,nums3,n1,n2);
        Arrays.sort(nums3);
        if(n3%2==0){
            return (float) (nums3[n3/2]+nums3[n3/2-1])/2;
        }
        return nums3[n3/2];
        
    }
}