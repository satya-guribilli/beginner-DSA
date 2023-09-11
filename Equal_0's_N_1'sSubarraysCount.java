/*problem link:       https://practice.geeksforgeeks.org/problems/split-the-binary-string-into-substrings-with-equal-number-of-0s-and-1s/1 */



class Solution {
    public static int maxSubStr(String str) {
       //Write your code here
       int z_c = 0;
       int o_c = 0;
       int t_c = 0;
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='0'){
               z_c ++;
           }
           else o_c++;
           
           if(z_c == o_c) {
               t_c++;
               z_c = 0;
               o_c = 0;
           }
       }
       if(z_c>0 || o_c>0) return -1;
       return t_c;
    }
}