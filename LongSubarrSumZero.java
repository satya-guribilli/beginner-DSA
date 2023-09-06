/*Problem : longest subarray sum equals to 0;
Problem link:   https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
*/

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
