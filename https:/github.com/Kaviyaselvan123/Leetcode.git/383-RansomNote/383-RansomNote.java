// Last updated: 7/14/2026, 2:05:22 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(char ch:magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}