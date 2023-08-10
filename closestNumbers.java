// Sorting is useful as the first step in many different tasks. 
// The most common task is to make finding things easier, but there are other uses as well. 
// In this case, it will make it easier to determine which pair or pairs of elements have the
// smallest absolute difference between them.

public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    int min = Integer.MAX_VALUE;
    Collections.sort(arr);
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0;i<arr.size()-1;i++){
        if(Math.abs(arr.get(i)-arr.get(i+1))<min){
            min = Math.abs(arr.get(i)-arr.get(i+1));
        }
    }
    for(int i=0;i<arr.size()-1;i++){
        if(Math.abs(arr.get(i)-arr.get(i+1))<=min){
            al.add(arr.get(i));
            al.add(arr.get(i+1));
        }
    }
    return al;
    

    }









