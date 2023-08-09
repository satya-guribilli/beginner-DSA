// An integer  is a divisor of an integer  if the remainder of .

// Given an integer, for each digit that makes up the integer determine 
// whether it is a divisor. Count the number of divisors occurring within the integer.


public static int findDigits(int n) {
    // Write your code here
    
    int count=0;
    if(n==0) return 1;
    int temp=n;
    while(temp!=0){
        int val = temp%10;
        if(val!=0&&n%val==0) count++;
        temp = temp/10;
    }
    
    return count;
}