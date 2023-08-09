// <!-- John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

// For each array, perform a number of right circular rotations and return the values of the elem
// ents at the given indices. -->

public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    
    Map<Integer,Integer> hmap = new HashMap<>();
    List<Integer> returnvalues = new ArrayList<>();
    for(int i=0;i<a.size();i++){
        hmap.put((i+k)%a.size(),a.get(i));
    }    
    for(int q: queries){
        returnvalues.add(hmap.get(q));
    }
    return returnvalues;

    }