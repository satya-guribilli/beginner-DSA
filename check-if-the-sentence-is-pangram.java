/*
 * problem link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * 
 * A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


 */

import java.util.HashMap;

class Solution{
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            hmap.put(sentence.charAt(i),1);
        }
        if(hmap.size() == 26) return true;
        else return false;
    }
}