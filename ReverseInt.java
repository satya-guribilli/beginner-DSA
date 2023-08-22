/* Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

  */



class Solution {
    public int reverse(int x) {
        
        int div = 0;
        while(x!=0){
            int rem = x%10;
            if (div > Integer.MAX_VALUE / 10 || (div == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
                
            if (div < Integer.MIN_VALUE / 10 || (div == Integer.MIN_VALUE / 10 && rem < -8))  return 0;
               
            div = div*10 + rem;
            x = x/10;
        }
        
       
        return div;
    }
}