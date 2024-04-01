class Solution {
    public int commonFactors(int a, int b) {
        int gcd = gcd(a,b);
        return count(gcd);
    }
    public int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int count(int a){
        int count = 0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                if(a/i==i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
}