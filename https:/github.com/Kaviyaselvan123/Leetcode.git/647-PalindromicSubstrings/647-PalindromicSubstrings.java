// Last updated: 7/14/2026, 2:05:05 PM
class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String t=s.substring(i,j+1);
                if(ispalin(t)){
                    c++;
                }
            }
        }
        return c;
    }
    public static boolean ispalin(String u){
        int i=0,j=u.length()-1;
        while(i<j){
            if(u.charAt(i)!=u.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}