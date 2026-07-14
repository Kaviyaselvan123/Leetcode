// Last updated: 7/14/2026, 2:05:34 PM
class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
        return false;
       }
       char[] k=s.toCharArray();
       char[] d=t.toCharArray();
       Arrays.sort(k);
       Arrays.sort(d);
       if(Arrays.equals(k,d)){
        return true;
       }
       return false;
    }
}