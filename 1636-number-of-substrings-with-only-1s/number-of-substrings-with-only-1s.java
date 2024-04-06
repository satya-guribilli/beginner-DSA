class Solution {
    public int numSub(String s) {
        long count = 0;
        long sum = 0;
        
        int n = s.length();
        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
            if(c=='1') count++;
            else{
                sum += (count*(count+1))/2;
                count = 0;
            }

        }
        sum += (count*(count+1))/2;
        return (int) (sum % (Math.pow(10,9)+7));
    }
}