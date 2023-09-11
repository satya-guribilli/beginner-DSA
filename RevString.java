
/* Reverse the string in place 

problem link: https://leetcode.com/problems/reverse-string/description/

*/
class Solution {
    public void reverseString(char[] s) {
        
        for(int i=0 , j = s.length-1;i<s.length/2;j--,i++){
            char temp = s[i];
            s[i]  =  s[j];
            s[j] = temp;
           

        }
        
    }
}