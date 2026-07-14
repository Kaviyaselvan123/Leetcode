// Last updated: 7/14/2026, 2:05:17 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<t.length()&&j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }else i++;
        }
        if(j==s.length()) return true;
        return false;


        
    }
}