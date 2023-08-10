// Find the median of two sorted arrays


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n3 = nums1.length+nums2.length;
        int[] newarr = new int[n3];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                newarr[k] = nums1[i];
                i++;
            }
            else{
                newarr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            newarr[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            newarr[k] = nums2[j];
            j++;
            k++;
        }
        if(n3%2==0){
            return (float) (newarr[n3/2]+newarr[n3/2-1])/2;
        }
        return newarr[n3/2];
    }
}





