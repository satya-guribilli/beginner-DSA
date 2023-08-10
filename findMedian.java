// The median of a list of numbers is essentially its middle element after sorting. 
// The same number of elements occur after it as before. 
// Given a list of numbers with an odd number of elements, find the median?

public static int findMedian(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int n= arr.size();
    if(n%2==0){
        return (arr.get(n/2)+arr.get(n/2-1));
    }
    return arr.get(n/2);

    }