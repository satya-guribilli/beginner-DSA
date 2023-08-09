<!-- You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of  sticks, print the number of sticks that are left before each iteration until there are none left. -->

public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    int removedsticks = 0;
    int totalsticks = arr.size();
    Collections.sort(arr);
    List<Integer> stickpieces = new ArrayList<>();
    while(removedsticks!=totalsticks){
        int val = arr.get(removedsticks);
        stickpieces.add(totalsticks-removedsticks);
        for(int i=removedsticks;i<arr.size();i++){
            int num = arr.get(i)-val;
            arr.set(i,num);
            if(arr.get(i)==0) removedsticks++;
        }
        
        
    } 
    return stickpieces;   
    }