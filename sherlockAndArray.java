// Watson gives Sherlock an array of integers. His challenge is to find 
// an element of the array such that the sum of all elements 
// to the left is equal to the sum of all elements to the right.


public static String balancedSums(List<Integer> arr) {

int totalSum = 0;
    
for(int i=0;i<arr.size();i++){
    
    totalSum += arr.get(i);
}
int leftSum = 0;
for(int i=0;i<arr.size();i++){
    totalSum -= arr.get(i);
    if(totalSum==leftSum) return "YES";
    leftSum+=arr.get(i);
    
}
return "NO";


}