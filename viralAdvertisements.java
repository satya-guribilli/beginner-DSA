// HackerLand Enterprise is adopting a new viral advertising strategy.
//  When they launch a new product, they advertise it to exactly  people on social media.

public static int viralAdvertising(int n) {
    // Write your code here
    double shared = 5;
    
    double liked =  Math.floor(shared/2);
    int cumulative = 2;
    for(int i=2;i<=n;i++){
        shared = liked*3;
        liked = Math.floor(shared/2);
        cumulative += liked;
    }
    return cumulative;

    }