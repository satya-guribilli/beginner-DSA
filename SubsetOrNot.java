// You don't need to read input or print anything. 
// Your task is to complete the function isSubset() which takes the array a1[], a2[],
//  its size n and m as inputs and 
// return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        List<Long> ls = new ArrayList<>();
        for(Long ele:a1){
            ls.add(ele);
        }
        for(Long val:a2){
            if(!ls.contains(val)){
                return "No";
            }
            else{
                ls.remove(val);
            }
        }
        return "Yes";
        
    }
}