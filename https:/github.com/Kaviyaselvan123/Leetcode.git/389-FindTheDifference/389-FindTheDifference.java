// Last updated: 7/14/2026, 2:05:19 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char kd=0;
        for(char i:s.toCharArray()){
            kd^=i;
        }
        for(char j:t.toCharArray()){
            kd^=j;
        }
        return kd;
    }
}