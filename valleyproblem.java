public static int countingValleys(int steps, String path) {
    // Write your code here
    int count = 0;
    int valleys = 0;
    for(int i=0;i<steps;i++){
        int prevcount = count;
        if(path.charAt(i)=='U'){
            count++;
        } 
        else{
            count--;
        }
        if(prevcount == -1 && count == 0) valleys++;
    }
    return valleys;

    }

}