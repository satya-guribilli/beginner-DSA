// A video player plays a game in which the character competes in 
// a hurdle race. Hurdles are of varying heights, and the characters have a
//  maximum height they can jump. There is a magic potion they can take that
//   will increase their maximum jump height by  unit for each dose. How many doses of the potion must the 
// character take to be able to jump all of the hurdles. 
// If the character can already clear all of the hurdles, return .


public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    int max = 0;
    
    for(int i=0;i<height.size();i++){
        if(height.get(i)>max ) max = height.get(i);
    }
    if(max>k){
        return max-k;
    }
    else{
        return 0;
    }

    }


