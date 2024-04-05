class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        String ans = "";
        char[] ar = s.toCharArray();
        stack.push(s.charAt(0));
        for(int i=1;i<n;i++){
            if((!stack.empty()) && (stack.peek()-ar[i]==32 || stack.peek()-ar[i]==-32)){
                stack.pop();
            }
            else{
                stack.push(ar[i]);
            }
        }
        while(!stack.empty()){
            ans = stack.pop()+ans;
        }
        return ans;
    }
}