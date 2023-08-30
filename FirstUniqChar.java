/*Given a string s, find the first non-repeating character in it and return its index.
 If it does not exist, return -1. */



class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(hmap.get(s.charAt(i))<2) return i;
        }
        return -1;
    }
}