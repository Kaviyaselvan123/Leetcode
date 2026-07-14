// Last updated: 7/14/2026, 2:04:42 PM
class Solution {
    public int scoreOfString(String s) {
     int d=0;
     for(int i=1;i<s.length();i++){
        d+=Math.abs((int)s.charAt(i-1)-(int)s.charAt(i));
     }
     return d;   
    }
}