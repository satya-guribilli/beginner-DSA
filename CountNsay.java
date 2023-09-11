
/* problem link:  https://leetcode.com/problems/count-and-say/description/

*/

class Solution {
    public String countAndSay(int n) {
       
       
        if(n == 0) return "";
    String res = "1";
   for(int i = 1; i <n; i++){
       String s = res;  res="";  
       int count = 1;// attention for the logic
       char pre = s.charAt(0);
       for(int j = 1; j < s.length(); j++){
            if(s.charAt(j) == pre)
                count++;
            else{
                res += count+""+pre;
                pre = s.charAt(j);
                count = 1;
            }
      }
      res += count +""+ pre;
   }
   return String.valueOf(res);
    }
}