// Last updated: 7/14/2026, 2:04:48 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char a[]=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            int b=indices[i];
            a[b]=s.charAt(i);
        }
        return new String(a);
    }
}