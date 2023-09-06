/*Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

Problem link : https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

*/
class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        // code here
        
        int sum = 0;
        int count = 0;
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        for(int i=0;i<N;i++){
            sum = sum+Arr[i];
            if(hmap.containsKey(sum-k)){
                count+=hmap.get(sum-k);
                if(hmap.containsKey(sum)){
                    int val= hmap.get(sum);
                    hmap.put(sum,val+1);
                }
                else{
                    hmap.put(sum,1);
                }
            }
            else{
                if(hmap.containsKey(sum)){
                    int val= hmap.get(sum);
                    hmap.put(sum,val+1);
                }
                else{
                    hmap.put(sum,1);
                }
            }
            
        }
        return count;
        
    }
}
