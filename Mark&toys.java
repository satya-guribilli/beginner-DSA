// Mark and Jane are very happy after having their first child. 
// Their son loves toys, so Mark wants to buy some. There are a number of 
// different toys lying in front of him, tagged with their prices. 
// Mark has only a certain amount to spend, and he wants to maximize 
// the number of toys he buys with this money. Given a list of toy
//  prices and an amount to spend, determine the maximum number of gifts he can buy.


 
 
 public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
    Collections.sort(prices);
    int count = 0;
    int sum = 0;
    for(int val:prices){
        sum+=val;
        if(sum<k){
            
            count++;
        }
        else break;
    }
    return count;

    }

}