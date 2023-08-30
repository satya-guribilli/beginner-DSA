/*Given an array with repeated elements, the task is to 
find the maximum distance between two occurrences of an element.*/




class Solution
{
    int maxDistance(int arr[], int n)
    {
	// Your code here
	Map<Integer,Integer> hmap = new HashMap<>();
	int max_dist = 0;
	for(int i=0;i<n;i++){
	    if(!hmap.containsKey(arr[i])){
	        hmap.put(arr[i],i);
	    }
	    
	    else{
	        max_dist = Math.max(max_dist,i-hmap.get(arr[i]));
	    }
	}
	return max_dist;
    }
}
