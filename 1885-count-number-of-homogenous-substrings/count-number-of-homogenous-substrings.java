class Solution {
    public int countHomogenous(String s) {
        long mod = 1000000007;
        long count = 1;
        long ans = 0;
        for(int i=1;i<s.length();i++){
            Character c = s.charAt(i);
            if(c==s.charAt(i-1)) count++;
            else{
                ans+= count*(count+1)/2;
                count=1;
            }
        }
        ans += count*(count+1)/2;
        return (int) (ans%mod);

    }
}